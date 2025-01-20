package com.grafysi.hierarpc.core;

import java.util.List;

public interface ServiceDefinition {

    Object getServiceImpl();

    String getServiceName();

    <T, R> List<MethodDefinition<T, R>> getMethodDefinitions();
}
