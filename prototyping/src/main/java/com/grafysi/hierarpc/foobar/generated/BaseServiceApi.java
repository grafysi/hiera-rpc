package com.grafysi.hierarpc.foobar.generated;

import com.grafysi.hierarpc.annotation.*;
import com.grafysi.hierarpc.prototyping.foobar.proto.*;
import io.grpc.stub.StreamObserver;

public interface BaseServiceApi {

    /**
     * FooService class level java docs
     */
    @GrpcApi
    interface FooService extends CallObservingDeclarations {

        /**
         * Method level java docs
         */
        @GrpcMethod
        @NoDefaultImpl
        void createFoo(FooCreateRequest request, StreamObserver<FooMessage> responseObserver);

        /**
         * Method level java docs
         */
        @GrpcMethod
        @NoDefaultImpl
        void getFoo(FooGetRequest request, StreamObserver<FooMessage> responseObserver);

        /**
         * Method level java docs
         */
        @GrpcMethod
        @NoDefaultImpl
        void subscribeFoo(SubscribeFooRequest request, StreamObserver<FooMessage> responseObserver);

        /**
         * Method level java docs
         */
        @GrpcMethod
        @NoDefaultImpl
        StreamObserver<FooMessage> publishFoo(StreamObserver<PublishFooResponse> responseObserver);

        /**
         * Method level java docs
         */
        @GrpcMethod
        @NoDefaultImpl
        StreamObserver<FooMessage> processFoo(StreamObserver<FooMessage> responseObserver);
    }

    /**
     * BarService class level java docs
     */
    @GrpcApi
    interface BarService extends CallObservingDeclarations {

        /**
         * Method level java docs
         */
        @GrpcMethod
        @NoDefaultImpl
        void createBar(BarCreateRequest request, StreamObserver<BarMessage> responseObserver);

        /**
         * Method level java docs
         */
        @GrpcMethod
        @NoDefaultImpl
        void getBar(BarGetRequest request, StreamObserver<BarMessage> responseObserver);
    }

    /**
     * List applying observing
     */
    interface CallObservingDeclarations {
        /**
         * Apply all observing by default
         */
        default CallObserving[] callObservingDeclarations() {
            return CallObserving.values();
        }
    }

    enum CallObserving {

        /**
         * CallObserving java docs
         */
        @DefaultImplBy("hierarpc/foo-bar")
        MESSAGE_LOGGING,

        /**
         * CallObserving java docs
         */
        @DefaultImplBy("hierarpc/foo-bar")
        AUTHENTICATING
    }

}
