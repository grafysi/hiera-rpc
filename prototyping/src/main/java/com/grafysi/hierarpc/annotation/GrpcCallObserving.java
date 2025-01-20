package com.grafysi.hierarpc.annotation;

public @interface GrpcCallObserving {
    int order();
    String implementedBy() default "";
}
