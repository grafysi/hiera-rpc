package com.grafysi.hierarpc.core;

import com.grafysi.hierarpc.api.ManagedInterceptor;
import com.grafysi.hierarpc.api.MethodInfo;
import io.grpc.Metadata;

import java.util.Map;

public class InterceptorChain implements ManagedInterceptor {

    private final Map<String, ManagedInterceptor> chained;

    @Override
    public InterceptHandler interceptCall(MethodInfo methodInfo, Metadata metadata) {
        chained.
    }
}
