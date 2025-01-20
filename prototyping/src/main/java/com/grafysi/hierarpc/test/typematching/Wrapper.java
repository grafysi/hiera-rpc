package com.grafysi.hierarpc.test.typematching;

public class Wrapper<T> {

    private final T value;

    private Wrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static <T> Wrapper<T> wrap(T value) {
        return new Wrapper<>(value);
    }

}
