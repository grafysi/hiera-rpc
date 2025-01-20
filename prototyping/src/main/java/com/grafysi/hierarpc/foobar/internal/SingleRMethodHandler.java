package com.grafysi.hierarpc.foobar.internal;

import io.grpc.stub.StreamObserver;

public interface SingleRMethodHandler<T, R> {

    void invoke(T request, StreamObserver<R> responseObserver);
}
