package com.grafysi.hierarpc.foobar.internal;

import com.grafysi.hierarpc.prototyping.foobar.proto.FooMessage;
import com.grafysi.hierarpc.prototyping.foobar.proto.SubscribeFooRequest;
import io.grpc.stub.StreamObserver;

public class MethodHandler_FooService_SubscribeFoo
        implements SingleRMethodHandler<SubscribeFooRequest, FooMessage> {

    private FooServiceProxy proxy;

    @Override
    public void invoke(SubscribeFooRequest request, StreamObserver<FooMessage> responseObserver) {
        proxy.subscribeFoo(request, responseObserver);
    }
}
