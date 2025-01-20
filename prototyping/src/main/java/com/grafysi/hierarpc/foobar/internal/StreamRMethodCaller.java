package com.grafysi.hierarpc.foobar.internal;

import com.grafysi.hierarpc.exception.NotImplementedException;
import io.grpc.stub.StreamObserver;
import net.bytebuddy.implementation.bind.annotation.BindingPriority;

import java.util.HashMap;
import java.util.Map;

public class StreamRMethodCaller<T, R> {

    private final Map<String, StreamRMethodHandler<T, R>> handlers = new HashMap<>();

    private static final String namespace = "a-namespace";

    @BindingPriority(BindingPriority.DEFAULT)
    public StreamObserver<T> call(StreamObserver<R> responseObserver) {
        var handler = handlers.get(namespace);
        if (handler == null) {
            throw new NotImplementedException("No implementation found for namespace " + namespace);
        }
        return handler.invoke(responseObserver);
    }

    public void addHandlerFor(String namespace, StreamRMethodHandler<T, R> handler) {
        handlers.put(namespace, handler);
    }

    public static <T, R> StreamRMethodCaller<T, R> create(Class<T> tClass, Class<R> rClass) {
        return new StreamRMethodCaller<>();
    }
}
