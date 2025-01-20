package com.grafysi.hierarpc.test.supercir;

public abstract class AbstractFilter {

    public void needFilter() {
        filter();
        System.out.println("needFilter successfully called");
    }

    public abstract boolean filter();
}
