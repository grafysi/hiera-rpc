package com.grafysi.hierarpc.test.supercir;

public class ChildFilter extends AbstractFilter {

    @Override
    public boolean filter() {
        needFilter();
        System.out.println("filter successfully called");
        return true;
    }
}
