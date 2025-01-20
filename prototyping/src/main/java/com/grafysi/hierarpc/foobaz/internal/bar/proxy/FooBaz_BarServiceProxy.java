package com.grafysi.hierarpc.foobaz.internal.bar.proxy;

import com.grafysi.hierarpc.exception.AbstractMethodException;
import com.grafysi.hierarpc.foobaz.impl.BarServiceImpl;
import com.grafysi.hierarpc.prototyping.foobar.proto.BarGetRequest;
import com.grafysi.hierarpc.prototyping.foobar.proto.BarMessage;
import io.grpc.stub.StreamObserver;

public class FooBaz_BarServiceProxy extends BarServiceImpl {

    private FooBaz_BarServiceUnMasked unMasked;

    @Override
    public boolean postFilter(BarMessage bar) {
        throw new AbstractMethodException();
    }

    @Override
    public void getBar(BarGetRequest request, StreamObserver<BarMessage> responseObserver) {
        unMasked.getBar(request, responseObserver);
    }
}
