package com.grafysi.hierarpc.foobaz.internal.bar.proxy;

import com.grafysi.hierarpc.foobar.internal.BarServiceProxy;
import com.grafysi.hierarpc.prototyping.foobar.proto.BarMessage;

public class FooBaz_BarServiceUnMasked extends BarServiceProxy {

    private FooBaz_BarServiceOverridden overridden;

    @Override
    public boolean filterBar(BarMessage bar) {
        return overridden.filterBar(bar);
    }
}
