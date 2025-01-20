package com.grafysi.hierarpc.foobar.internal;

import com.grafysi.hierarpc.api.MethodInfo;
import io.grpc.Metadata;

public interface GrpcCallPreprocessor {

    CallObserver preprocess(MethodInfo methodInfo, Metadata metadata, CallPreprocess callPreprocess);
}
