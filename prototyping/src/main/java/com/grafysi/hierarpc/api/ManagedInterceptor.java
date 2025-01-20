package com.grafysi.hierarpc.api;

import io.grpc.Status;

public interface ManagedInterceptor {

    InterceptHandler interceptCall(CallDetails details);

    interface InterceptHandler {

        InterceptResult getInterceptResult();

        void onClientCancelled();




        <T> T handleRequestMessage(T message);

        void handleRequestCancel();

        void onComplete();

        <RespT> RespT onResponseMessage(RespT message);

        void onClose(Status status);
    }

}
