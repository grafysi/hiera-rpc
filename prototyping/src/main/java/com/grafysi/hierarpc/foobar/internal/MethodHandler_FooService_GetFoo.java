package com.grafysi.hierarpc.foobar.internal;

import com.grafysi.hierarpc.prototyping.foobar.proto.FooGetRequest;
import com.grafysi.hierarpc.prototyping.foobar.proto.FooMessage;
import io.grpc.stub.StreamObserver;

public class MethodHandler_FooService_GetFoo
        implements SingleRMethodHandler<FooGetRequest, FooMessage> {

    private FooServiceProxy proxy;

    @Override
    public void invoke(FooGetRequest request, StreamObserver<FooMessage> responseObserver) {
        proxy.getFoo(request, responseObserver);
    }
}
