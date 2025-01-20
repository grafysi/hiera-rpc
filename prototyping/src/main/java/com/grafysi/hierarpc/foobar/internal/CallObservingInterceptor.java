package com.grafysi.hierarpc.foobar.internal;

import io.grpc.*;

import java.util.HashMap;
import java.util.Map;

public class CallObservingInterceptor implements ServerInterceptor {

    private final Map<String, GrpcCallPreprocessor> preprocessors = new HashMap<>();

    private static final String namespace = "a-namespace";

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> serverCall,
            Metadata metadata,
            ServerCallHandler<ReqT, RespT> next) {

        var preprocessor = preprocessors.get(namespace);
        if (preprocessor == null) {
            return next.startCall(serverCall, metadata);
        }

        var observer = preprocessor.preprocess(null, metadata, CallPreprocess.createDefault());

        var wrappedCall = new ForwardingServerCall.SimpleForwardingServerCall<>(serverCall) {
            @Override
            public void sendMessage(RespT message) {
                observer.onResponseMessage(message);
                super.sendMessage(message);
            }

            @Override
            public void close(Status status, Metadata trailers) {
                observer.onClose(status);
                super.close(status, metadata);
            }
        };

        return new ForwardingServerCallListener.SimpleForwardingServerCallListener<>(
                next.startCall(wrappedCall, metadata)) {

            @Override
            public void onMessage(ReqT message) {
                observer.onRequestMessage(message);
                super.onMessage(message);
            }

            @Override
            public void onCancel() {
                observer.onRequestCancel();
                super.onCancel();
            }

            @Override
            public void onComplete() {
                observer.onComplete();
                super.onComplete();
            }
        };
    }
}


































