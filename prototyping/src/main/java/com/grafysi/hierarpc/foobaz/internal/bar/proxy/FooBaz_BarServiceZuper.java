package com.grafysi.hierarpc.foobaz.internal.bar.proxy;

import com.grafysi.hierarpc.foobar.internal.BarServiceProxy;
import com.grafysi.hierarpc.foobaz.generated.BaseServiceApi;
import com.grafysi.hierarpc.prototyping.foobar.proto.BarCreateRequest;
import com.grafysi.hierarpc.prototyping.foobar.proto.BarGetRequest;
import com.grafysi.hierarpc.prototyping.foobar.proto.BarMessage;
import io.grpc.stub.StreamObserver;

public class FooBaz_BarServiceZuper implements BaseServiceApi.BarService {

    private BarServiceProxy proxy;

    @Override
    public boolean filterBar(BarMessage bar) {
        return proxy.filterBar(bar);
    }

    @Override
    public void createBar(BarCreateRequest request, StreamObserver<BarMessage> responseObserver) {
        proxy.createBar(request, responseObserver);
    }

    @Override
    public void getBar(BarGetRequest request, StreamObserver<BarMessage> responseObserver) {
        proxy.getBar(request, responseObserver);
    }
}
