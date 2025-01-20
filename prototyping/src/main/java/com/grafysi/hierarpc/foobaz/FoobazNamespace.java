package com.grafysi.hierarpc.foobaz;

import com.grafysi.hierarpc.annotation.NamespaceConfig;
import com.grafysi.hierarpc.api.Contextualizer;
import com.grafysi.hierarpc.foobaz.impl.FazServiceImpl;
import com.grafysi.hierarpc.foobaz.interceptor.HeaderInterceptor;
import com.grafysi.hierarpc.foobaz.interceptor.TimeoutInterceptor;

@NamespaceConfig(
        name = "hierarpc/foo-baz",
        hieraServicePackages = {"com.grafysi.hierarpc.foobaz.impl"},
        hieraServices = {FazServiceImpl.class},
        interceptors = {HeaderInterceptor.class, TimeoutInterceptor.class},
        extendsNamespaces = {"hierarpc/foo-baz"}
)
public class FoobazNamespace implements com.grafysi.hierarpc.api.Namespace {

    @Override
    public Contextualizer getContextualizer() {
        return null;
    }

}
