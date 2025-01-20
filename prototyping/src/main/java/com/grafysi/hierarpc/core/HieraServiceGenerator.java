package com.grafysi.hierarpc.core;

import com.grafysi.hierarpc.foobar.internal.SingleRMethodHandler;
import com.grafysi.hierarpc.foobar.internal.StreamRMethodHandler;

public interface HieraServiceGenerator {

    default <A, S extends A, P, R extends S> R createService(
            Class<A> baseApi, Class<S> serviceImpl, P parentProxy) {
        throw new RuntimeException();
    }

    default SingleRMethodHandler<?, ?> createSingleRHandler(Object proxy, String methodName, String serviceName) {
        throw new RuntimeException();
    }

    default StreamRMethodHandler<?, ?> createStreamRHandler(Object proxy, String methodName, String serviceName) {
        throw new RuntimeException();
    }

    static HieraServiceGenerator createDefault() {
        return new HieraServiceGenerator() {
        };
    }
}
