package com.sebastian.varios;

public class Impl {
    interface I1 {
        default void hola(){
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
    }
}