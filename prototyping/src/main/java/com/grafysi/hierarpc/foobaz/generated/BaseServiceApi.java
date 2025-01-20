package com.grafysi.hierarpc.foobaz.generated;

import com.grafysi.hierarpc.annotation.*;
import com.grafysi.hierarpc.exception.UninitializedException;
import com.grafysi.hierarpc.prototyping.foobar.proto.*;
import com.grafysi.hierarpc.prototyping.foobaz.proto.FazCreateRequest;
import com.grafysi.hierarpc.prototyping.foobaz.proto.FazGetRequest;
import com.grafysi.hierarpc.prototyping.foobaz.proto.FazMessage;
import io.grpc.stub.StreamObserver;

public interface BaseServiceApi {
    /**
     * FazService class level java docs
     */
    @GrpcApi
    interface FazService extends InterceptorDeclaration {

        @GrpcMethod
        @NoDefaultImpl
        void createFaz(FazCreateRequest request, StreamObserver<FazMessage> responseObserver);

        @GrpcMethod
        @NoDefaultImpl
        void getFaz(FazGetRequest request, StreamObserver<FazMessage> responseObserver);
    }

    /**
     * FooService class level java docs
     */
    @InheritedApi
    interface FooService extends InterceptorDeclaration {
        /**
         * Method level java docs
         */
        @GrpcMethod
        @DefaultImplBy("hierarpc/foo-bar")
        default void createFoo(FooCreateRequest request, StreamObserver<FooMessage> responseObserver) {
            throw new UninitializedException();
        }

        /**
         * Method level java docs
         */
        @GrpcMethod
        @DefaultImplBy("hierarpc/foo-bar")
        default void getFoo(FooGetRequest request, StreamObserver<FooMessage> responseObserver) {
            throw new UninitializedException();
        }

        /**
         * Method level java docs
         */
        @GrpcMethod
        @DefaultImplBy("hierarpc/foo-bar")
        default void subscribeFoo(SubscribeFooRequest request, StreamObserver<FooMessage> responseObserver) {
            throw new UninitializedException();
        }

        /**
         * Method level java docs
         */
        @GrpcMethod
        @DefaultImplBy("hierarpc/foo-bar")
        default StreamObserver<FooMessage> publishFoo(StreamObserver<PublishFooResponse> responseObserver) {
            throw new UninitializedException();
        }

        /**
         * Method level java docs
         */
        @GrpcMethod
        @DefaultImplBy("hierarpc/foo-bar")
        default StreamObserver<FooMessage> processFoo(StreamObserver<FooMessage> responseObserver) {
            throw new UninitializedException();
        }

        /**
         * Method level java docs
         */
        @InternalMethod
        @NoDefaultImpl
        boolean filterFoo(FooMessage foo);
    }

    /**
     * BarService class level java docs
     */
    @GrpcApi
    interface BarService extends InterceptorDeclaration {

        /**
         * Method level java docs
         */
        @GrpcMethod
        @DefaultImplBy("hierarpc/foo-bar")
        default void createBar(BarCreateRequest request, StreamObserver<BarMessage> responseObserver) {
            throw new UninitializedException();
        }

        /**
         * Method level java docs
         */
        @GrpcMethod
        @DefaultImplBy("hierarpc/foo-bar")
        default void getBar(BarGetRequest request, StreamObserver<BarMessage> responseObserver) {
            throw new UninitializedException();
        }

        @InternalMethod
        @NoDefaultImpl
        boolean filterBar(BarMessage bar);
    }
}

























