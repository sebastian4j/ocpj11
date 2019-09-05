package com.sebastian.interfaces;

/**
 *
 * @author Sebastián Ávila A.
 */
public interface A {
    static String e() {
        return "static-A";
    }
    default String x() {
        return "A";
    }
}
