package com.sebastian.varios;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Impl {
    interface I1 {
        private void holas() {

        }
        default void hola() {
            System.out.println("interface");
        }
    }

    static class C1 implements I1 {
        @Override
        public void hola() {
            System.out.println("clase");
        }
    }

    public static void main(String[] args) {
        I1 i1 = new C1();
        i1.hola();
        double a = Stream.<Integer>of(1,2).collect(Collectors.averagingDouble(aa -> aa));
        System.out.println(a);
    }
}
