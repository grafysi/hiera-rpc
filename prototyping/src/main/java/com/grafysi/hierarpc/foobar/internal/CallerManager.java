package com.grafysi.hierarpc.foobar.internal;

import java.util.List;

public interface CallerManager {

    void createCallersFor(List<Class<?>> grpcServices);

    void getStreamRMethodCallerFor(int methodId);

    void getSingleRMethodCallerFor(int methodId);

}
