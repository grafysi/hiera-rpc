package com.grafysi.hierarpc.foobar.impl;

import com.grafysi.hierarpc.annotation.HieraService;
import com.grafysi.hierarpc.annotation.InternalMethod;
import com.grafysi.hierarpc.foobar.generated.BaseServiceApi;
import com.grafysi.hierarpc.prototyping.foobar.proto.*;
import io.grpc.stub.StreamObserver;

@HieraService
public abstract class AbstractFooService implements BaseServiceApi.FooService {

    @Override
    public void createFoo(FooCreateRequest request, StreamObserver<FooMessage> responseObserver) {
        handleNoImpl();
    }

    @Override
    public void getFoo(FooGetRequest request, StreamObserver<FooMessage> responseObserver) {
        handleNoImpl();
    }

    @Override
    public void subscribeFoo(SubscribeFooRequest request, StreamObserver<FooMessage> responseObserver) {
        handleNoImpl();
    }

    @Override
    public StreamObserver<FooMessage> publishFoo(StreamObserver<PublishFooResponse> responseObserver) {
        return handleNoImplStream();
    }

    @Override
    public StreamObserver<FooMessage> processFoo(StreamObserver<FooMessage> responseObserver) {
        return handleNoImplStream();
    }

    @InternalMethod
    protected abstract boolean filterFoo(FooMessage foo);

    private void handleNoImpl() {
        throw new IllegalStateException();
    }

    private StreamObserver<FooMessage> handleNoImplStream() {
        throw new IllegalStateException();
    }
}
























