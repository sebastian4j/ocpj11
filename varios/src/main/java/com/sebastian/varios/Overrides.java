package com.sebastian.varios;

public class Overrides {
    public static void main(String[] args) {
        System.out.println("fin");
    }
    interface O1 {
        default void m() {}
    }
    abstract class O2 {
       abstract void m(); 
    }

    class O3 extends O2 implements O1 {
        public void m(){}
    }

    /** */

    interface i1 {
        void m();
    }
    class c1 implements i1 {
        public void m() {

        }
    }
}