package com.grafysi.hierarpc.test.typematching;

public interface IntParser {

    Wrapper<Integer> parse(Wrapper<String> strValue);

}
