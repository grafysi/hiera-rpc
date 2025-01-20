package com.grafysi.hierarpc.foobar.internal;

import com.grafysi.hierarpc.exception.AbstractMethodException;
import com.grafysi.hierarpc.foobar.impl.AbstractBarService;
import com.grafysi.hierarpc.prototyping.foobar.proto.BarMessage;

public class BarServiceProxy extends AbstractBarService {

    @Override
    public boolean filterBar(BarMessage bar) {
        throw new AbstractMethodException();
    }
}
