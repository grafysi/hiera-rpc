package com.grafysi.hierarpc.foobaz.internal.bar.proxy;

import com.grafysi.hierarpc.exception.AbstractMethodException;
import com.grafysi.hierarpc.foobaz.impl.BarServiceImpl;
import com.grafysi.hierarpc.prototyping.foobar.proto.BarMessage;

public class FooBaz_BarServiceOverridden extends BarServiceImpl {

    @Override
    public boolean postFilter(BarMessage bar) {
        throw new AbstractMethodException();
    }
}
