package com.grafysi.hierarpc.foobaz.internal.bar.handler;

import com.grafysi.hierarpc.foobar.internal.SingleRMethodHandler;
import com.grafysi.hierarpc.foobaz.internal.bar.proxy.FooBaz_BarServiceProxy;
import com.grafysi.hierarpc.prototyping.foobar.proto.BarCreateRequest;
import com.grafysi.hierarpc.prototyping.foobar.proto.BarMessage;
import io.grpc.stub.StreamObserver;

public class FooBaz_BarService_CreateBar implements SingleRMethodHandler<BarCreateRequest, BarMessage> {

    private FooBaz_BarServiceProxy proxy;

    @Override
    public void invoke(BarCreateRequest request, StreamObserver<BarMessage> responseObserver) {
        proxy.createBar(request, responseObserver);
    }
}
