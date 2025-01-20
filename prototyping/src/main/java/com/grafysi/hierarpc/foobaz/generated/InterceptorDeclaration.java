package com.grafysi.hierarpc.foobaz.generated;

import com.grafysi.hierarpc.annotation.DefaultImplBy;

public interface InterceptorDeclaration {

    enum InterceptorAlias {

        /**
         * Interceptor java docs
         */
        @DefaultImplBy("hierarpc/foo-bar")
        MESSAGE_LOGGING_INTERCEPTOR,

        /**
         * Interceptor java docs
         */
        @DefaultImplBy("hierarpc/foo-bar")
        AUTHENTICATING_INTERCEPTOR,

        /**
         * Interceptor java docs
         */
        @DefaultImplBy("hierarpc/foo-baz")
        HEADER_INTERCEPTOR,

        /**
         * Interceptor java docs
         */
        @DefaultImplBy("hierarpc/foo-baz")
        TIMEOUT_INTERCEPTOR
    }

    default InterceptorAlias[] declaredInterceptors() {
        return InterceptorAlias.values();
    }
}
