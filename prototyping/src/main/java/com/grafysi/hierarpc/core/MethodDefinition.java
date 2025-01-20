package com.grafysi.hierarpc.core;

import com.grafysi.hierarpc.api.MethodHandler;

public interface MethodDefinition<T, R> {

    String getMethodName();

    MethodType getMethodType();

    MethodHandler<T, R> getMethodHandler();
}
