package com.grafysi.hierarpc.foobaz.impl;

import com.google.protobuf.Message;
import com.grafysi.hierarpc.annotation.HieraService;
import com.grafysi.hierarpc.api.Initializable;
import com.grafysi.hierarpc.api.SuperAware;
import com.grafysi.hierarpc.foobaz.generated.BaseServiceApi;
import com.grafysi.hierarpc.prototyping.foobar.proto.BarCreateRequest;
import com.grafysi.hierarpc.prototyping.foobar.proto.BarMessage;
import io.grpc.stub.StreamObserver;

@HieraService
public abstract class BarServiceImpl
        implements BaseServiceApi.BarService, Initializable, SuperAware<BaseServiceApi.BarService> {

    private BaseServiceApi.BarService zuper;

    @Override
    public boolean filterBar(BarMessage bar) {
        return bar != null;
    }

    @Override
    public void createBar(BarCreateRequest request, StreamObserver<BarMessage> responseObserver) {
        logRequestMessage(request);
        zuper.createBar(request, responseObserver);
    }

    @Override
    public void setSuper(BaseServiceApi.BarService zuper) {
        this.zuper = zuper;
    }

    public abstract boolean postFilter(BarMessage bar);

    private void logRequestMessage(Message message) {
        // do-nothing
    }
}






















