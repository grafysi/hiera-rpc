package com.grafysi.hierarpc.api;

import io.grpc.stub.StreamObserver;

public interface MethodHandler<T, R> {

    void invoke(T request, R response);

    StreamObserver<T> invoke(StreamObserver<R> responseObserver);
}
