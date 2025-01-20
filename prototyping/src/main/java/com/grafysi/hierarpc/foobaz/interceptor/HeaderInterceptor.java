package com.grafysi.hierarpc.foobaz.interceptor;

import com.grafysi.hierarpc.api.ManagedInterceptor;
import com.grafysi.hierarpc.api.MethodInfo;
import io.grpc.Metadata;
import jdk.jshell.Snippet;

public class HeaderInterceptor implements ManagedInterceptor {

    @Override
    public InterceptHandler interceptCall(MethodInfo methodInfo, Metadata metadata) {
        return new InterceptHandler() {
            @Override
            public boolean shouldStartCall() {
                return false;
            }

            @Override
            public <ReqT> ReqT onRequestMessage(ReqT message) {
                return null;
            }

            @Override
            public void onRequestCancel() {

            }

            @Override
            public void onComplete() {

            }

            @Override
            public <RespT> RespT onResponseMessage(RespT message) {
                return null;
            }

            @Override
            public void onClose(Snippet.Status status) {

            }
        };
    }
}
