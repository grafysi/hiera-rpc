package com.grafysi.hierarpc.foobaz.impl;

import com.grafysi.hierarpc.annotation.HieraService;
import com.grafysi.hierarpc.api.Initializable;
import com.grafysi.hierarpc.foobaz.generated.BaseServiceApi;
import com.grafysi.hierarpc.prototyping.foobaz.proto.FazCreateRequest;
import com.grafysi.hierarpc.prototyping.foobaz.proto.FazGetRequest;
import com.grafysi.hierarpc.prototyping.foobaz.proto.FazMessage;
import io.grpc.stub.StreamObserver;

@HieraService
public class FazServiceImpl implements BaseServiceApi.FazService, Initializable {

    @Override
    public void createFaz(FazCreateRequest request, StreamObserver<FazMessage> responseObserver) {
        handleNoImpl();
    }

    @Override
    public void getFaz(FazGetRequest request, StreamObserver<FazMessage> responseObserver) {
        handleNoImpl();
    }

    private void handleNoImpl() {
        throw new IllegalStateException();
    }
}
