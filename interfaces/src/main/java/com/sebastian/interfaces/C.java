package com.sebastian.interfaces;

/**
 *
 * @author Sebastián Ávila A.
 */
public class C extends D implements A, B {
    public String x() {
        System.out.println(A.e());
        System.out.println(A.super.x());
        return A.super.x();
    }
    public static void main(String[] args) {
        System.out.println(new C().x());
        System.out.println(A.e());
    }
}
