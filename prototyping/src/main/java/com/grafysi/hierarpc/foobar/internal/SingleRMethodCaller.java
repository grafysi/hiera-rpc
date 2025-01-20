package com.grafysi.hierarpc.foobar.internal;

import com.grafysi.hierarpc.exception.NotImplementedException;
import io.grpc.stub.StreamObserver;
import net.bytebuddy.implementation.bind.annotation.BindingPriority;

import java.util.HashMap;
import java.util.Map;

public class SingleRMethodCaller<T, R> {

    private final Map<String, SingleRMethodHandler<T, R>> handlers = new HashMap<>();

    private static final String namespace = "a-namespace";

    @BindingPriority(BindingPriority.DEFAULT)
    public void callFor(T reqeust, StreamObserver<R> responseObserver) {
        var handler = handlers.get(namespace);
        if (handler == null) {
            throw new NotImplementedException("No implementation found for namespace " + namespace);
        }
        handler.invoke(reqeust, responseObserver);
    }

    public void addHandlerFor(String namespace, SingleRMethodHandler<T, R> handler) {
        handlers.put(namespace, handler);
    }

    public static <T, R> SingleRMethodCaller<T, R> create(Class<T> tClazz, Class<R> rClazz) {
        return new SingleRMethodCaller<>();
    }
}
