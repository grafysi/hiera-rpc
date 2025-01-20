package com.grafysi.hierarpc.core;

import com.grafysi.hierarpc.api.ManagedInterceptor;

public interface NamespaceModel {

    String getName();

    Class<?>[] getHieraServiceClasses();

    String[] getParentNamespaces();

    Class<? extends ManagedInterceptor> getInterceptorClasses();
}
