package com.grafysi.hierarpc.foobar;


import com.grafysi.hierarpc.annotation.GrpcCallObserving;
import com.grafysi.hierarpc.annotation.NamespaceConfig;
import com.grafysi.hierarpc.api.MethodInfo;
import io.grpc.Metadata;
import io.grpc.Status;

@NamespaceConfig(
        name = "foo-bar",
        hieraServicePackages = {"com.grafysi.hierarpc.foobar.impl"}
        /*hieraServices = {AbstractFooService.class, AbstractBarService.class}*/)
public class FooBarNamespace implements com.grafysi.hierarpc.api.Namespace {

    @GrpcCallObserving(order = 0)
    public CallObserver messageLogging(MethodInfo methodInfo, Metadata metadata, CallPreprocess preprocess) {
        return new CallObserver() {
            @Override
            public void onRequestMessage(Object message) {
                // no-op
            }

            @Override
            public void onRequestCancel() {
                // no-op
            }

            @Override
            public void onComplete() {
                // no-op
            }

            @Override
            public void onResponseMessage(Object message) {
                // no-op
            }

            @Override
            public void onClose(Status status) {
                // no-op
            }
        };
    }

    @GrpcCallObserving(order = 1)
    public CallObserver authenticating(MethodInfo methodInfo, Metadata metadata, CallPreprocess preprocess) {
        return new CallObserver() {
            @Override
            public void onRequestMessage(Object message) {

            }

            @Override
            public void onRequestCancel() {

            }

            @Override
            public void onComplete() {

            }

            @Override
            public void onResponseMessage(Object message) {

            }

            @Override
            public void onClose(Status status) {

            }
        };
    }
}
