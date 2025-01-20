package com.grafysi.hierarpc.api;

import io.grpc.Metadata;
import io.grpc.Status;

public interface InterceptResult {

    boolean shouldCloseCall();

    Status closeStatus();

    Metadata trailerHeaders();


}
