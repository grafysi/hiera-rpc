package com.grafysi.hierarpc.annotation;

import com.grafysi.hierarpc.api.ManagedInterceptor;

public @interface NamespaceConfig {

    String DEFAULT_PROTO_SRC_DIR = "src/main/proto";

    String name();

    Class<?>[] hieraServices() default {};

    String[] hieraServicePackages() default {};

    Class<? extends ManagedInterceptor>[] interceptors() default {};

    String[] extendsNamespaces() default {};

    String protoSrcDir() default DEFAULT_PROTO_SRC_DIR;
}
