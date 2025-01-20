package com.grafysi.hierarpc.core;

import com.grafysi.hierarpc.api.Contextualizer;
import com.grafysi.hierarpc.api.ManagedInterceptor;

import java.util.List;

public interface NamespaceDefinition {

    NamespaceModel getNamespaceModel();

    List<ServiceDefinition> getServiceDefinitions();

    List<ManagedInterceptor> getManagedInterceptors();

    Contextualizer getContextualizer();
}
