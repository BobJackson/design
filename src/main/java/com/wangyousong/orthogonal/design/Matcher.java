package com.wangyousong.orthogonal.design;

public interface Matcher<T> {

    boolean matches(T actual);

    static <T> Matcher<T> eq(T expected){
        return expected::equals;
    }

    static <T> Matcher<T> ne(T expected){
        return actual -> !expected.equals(actual);
    }

}
