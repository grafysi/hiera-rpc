package com.grafysi.hierarpc.foobar.impl;

import com.grafysi.hierarpc.annotation.*;
import com.grafysi.hierarpc.foobar.generated.BaseServiceApi;
import com.grafysi.hierarpc.prototyping.foobar.proto.BarCreateRequest;
import com.grafysi.hierarpc.prototyping.foobar.proto.BarGetRequest;
import com.grafysi.hierarpc.prototyping.foobar.proto.BarMessage;
import io.grpc.stub.StreamObserver;

@HieraService
public abstract class AbstractBarService implements BaseServiceApi.BarService {

    @Override
    public void createBar(BarCreateRequest request, StreamObserver<BarMessage> responseObserver) {
        handleNoImpl();
    }

    @Override
    public void getBar(BarGetRequest request, StreamObserver<BarMessage> responseObserver) {
        handleNoImpl();
    }

    @InternalMethod
    protected abstract boolean filterBar(BarMessage bar);

    private void handleNoImpl() {
        throw new IllegalStateException();
    }
}
