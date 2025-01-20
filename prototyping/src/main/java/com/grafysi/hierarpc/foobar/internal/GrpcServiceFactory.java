package com.grafysi.hierarpc.foobar.internal;

import com.google.protobuf.GeneratedMessageV3;
import io.grpc.BindableService;
import io.grpc.stub.StreamObserver;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.matcher.ElementMatchers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GrpcServiceFactory {

    private CallerManager callerManager;

    public BindableService createGrpcServiceOfType(Class<? extends BindableService> serviceType) {

        var builder = new ByteBuddy()
                .subclass(serviceType);

        for (var method : serviceType.getDeclaredMethods()) {
            builder = buildMethod(method, builder);
        }

        try (var unloaded = builder.make()){
            return unloaded.load(GrpcServiceFactory.class.getClassLoader())
                    .getLoaded()
                    .getDeclaredConstructor()
                    .newInstance();
        }
        catch (NoSuchMethodException
               | InvocationTargetException
               | IllegalAccessException
               | InstantiationException e) {
            throw new RuntimeException("Try to create service using public " +
                    "no args constructor failed for class "+ serviceType.getName(), e);
        }
    }

    private boolean isGrpcSingleRMethod(Method m) {
        return m.getParameterCount() == 2
                && m.getReturnType().isAssignableFrom(void.class)
                && m.getParameterTypes()[0].isAssignableFrom(GeneratedMessageV3.class)
                && m.getParameterTypes()[1].isAssignableFrom(StreamObserver.class);
    }

    private boolean isGrpcStreamRMethod(Method m) {
        return m.getParameterCount() == 1
                && m.getReturnType().isAssignableFrom(StreamObserver.class)
                && m.getParameterTypes()[0].isAssignableFrom(StreamObserver.class);
    }

    private<T> DynamicType.Builder<T> buildMethod(Method method, DynamicType.Builder<T> builder) {
        if (isGrpcSingleRMethod(method)) {
            return builder.method(ElementMatchers.named(method.getName()))
                    .intercept(MethodDelegation.to(
                            SingleRMethodCaller.create(
                                    method.getParameterTypes()[0], method.getParameterTypes()[1])));
        }
        else if (isGrpcStreamRMethod(method)) {
            return builder.method(ElementMatchers.named(method.getName()))
                    .intercept(MethodDelegation.to(
                            StreamRMethodCaller.create(
                                    method.getReturnType(), method.getParameterTypes()[0])));
        }
        return builder;
    }
}
























