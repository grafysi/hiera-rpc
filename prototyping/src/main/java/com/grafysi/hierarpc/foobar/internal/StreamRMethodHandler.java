package com.grafysi.hierarpc.foobar.internal;

import io.grpc.stub.StreamObserver;

public interface StreamRMethodHandler<T, R> {

    StreamObserver<T> invoke(StreamObserver<R> responseObserver);
}
