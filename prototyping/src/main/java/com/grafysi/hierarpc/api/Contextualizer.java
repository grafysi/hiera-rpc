package com.grafysi.hierarpc.api;

public interface Contextualizer {

    <T> T contextualize(T obj);
}
