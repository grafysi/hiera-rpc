package com.grafysi.hierarpc.foobar.internal;

import com.grafysi.hierarpc.prototyping.foobar.proto.FooMessage;
import io.grpc.stub.StreamObserver;

public class MethodHandler_FooService_ProcessFoo
        implements StreamRMethodHandler<FooMessage, FooMessage> {

    private FooServiceProxy proxy;

    @Override
    public StreamObserver<FooMessage> invoke(StreamObserver<FooMessage> responseObserver) {
        return proxy.processFoo(responseObserver);
    }

}
