package com.grafysi.hierarpc.foobar.internal;

import com.grafysi.hierarpc.prototyping.foobar.proto.BarCreateRequest;
import com.grafysi.hierarpc.prototyping.foobar.proto.BarMessage;
import io.grpc.stub.StreamObserver;

public class MethodHandler_BarService_CreateBar
        implements SingleRMethodHandler<BarCreateRequest, BarMessage> {

    private BarServiceProxy proxy;

    @Override
    public void invoke(BarCreateRequest request, StreamObserver<BarMessage> responseObserver) {
        proxy.createBar(request, responseObserver);
    }
}
