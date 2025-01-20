package com.grafysi.hierarpc.foobar.internal;

import com.grafysi.hierarpc.exception.AbstractMethodException;
import com.grafysi.hierarpc.foobar.impl.AbstractFooService;
import com.grafysi.hierarpc.prototyping.foobar.proto.FooMessage;

public class FooServiceProxy extends AbstractFooService {

    @Override
    public boolean filterFoo(FooMessage foo) {
        throw new AbstractMethodException();
    }
}
