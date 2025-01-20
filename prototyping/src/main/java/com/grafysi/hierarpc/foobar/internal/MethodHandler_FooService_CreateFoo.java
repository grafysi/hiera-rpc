package com.grafysi.hierarpc.foobar.internal;

import com.grafysi.hierarpc.prototyping.foobar.proto.FooCreateRequest;
import com.grafysi.hierarpc.prototyping.foobar.proto.FooMessage;
import io.grpc.stub.StreamObserver;

public class MethodHandler_FooService_CreateFoo
        implements SingleRMethodHandler<FooCreateRequest, FooMessage> {

    private FooServiceProxy proxy;

    public void invoke(FooCreateRequest request, StreamObserver<FooMessage> responseObserver) {
        proxy.createFoo(request, responseObserver);
    }
}
