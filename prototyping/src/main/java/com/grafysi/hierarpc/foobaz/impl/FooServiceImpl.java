package com.grafysi.hierarpc.foobaz.impl;

import com.grafysi.hierarpc.annotation.HieraService;
import com.grafysi.hierarpc.api.Initializable;
import com.grafysi.hierarpc.api.SuperAware;
import com.grafysi.hierarpc.foobaz.generated.BaseServiceApi;
import com.grafysi.hierarpc.prototyping.foobar.proto.FooMessage;
import com.grafysi.hierarpc.prototyping.foobar.proto.PublishFooResponse;
import io.grpc.stub.StreamObserver;

@HieraService
public class FooServiceImpl
        implements BaseServiceApi.FooService, Initializable, SuperAware<BaseServiceApi.FooService> {

    private BaseServiceApi.FooService zuper;

    @Override
    public boolean filterFoo(FooMessage foo) {
        return foo != null;
    }

    @Override
    public StreamObserver<FooMessage> publishFoo(StreamObserver<PublishFooResponse> responseObserver) {
        var wrappedResponseObserver = wrapResponseObserver(responseObserver);
        return wrapRequestObserver(zuper.publishFoo(wrappedResponseObserver));
    }

    @Override
    public void setSuper(BaseServiceApi.FooService zuper) {
        this.zuper = zuper;
    }

    private StreamObserver<PublishFooResponse> wrapResponseObserver(
            StreamObserver<PublishFooResponse> observer) {
        return observer;
    }

    private StreamObserver<FooMessage> wrapRequestObserver(
            StreamObserver<FooMessage> observer) {
        return observer;
    }
}





















