package com.grafysi.hierarpc.foobar.internal;

import com.grafysi.hierarpc.prototyping.foobar.proto.FooMessage;
import com.grafysi.hierarpc.prototyping.foobar.proto.PublishFooResponse;
import io.grpc.stub.StreamObserver;

public class MethodHandler_FooService_PublishFoo
        implements StreamRMethodHandler<FooMessage, PublishFooResponse> {

    private FooServiceProxy proxy;

    @Override
    public StreamObserver<FooMessage> invoke(StreamObserver<PublishFooResponse> responseObserver) {
        return proxy.publishFoo(responseObserver);
    }
}
