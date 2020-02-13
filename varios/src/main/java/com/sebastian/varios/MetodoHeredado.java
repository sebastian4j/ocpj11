package com.sebastian.varios;

import java.util.stream.Stream;

/**
 *
 * @author Sebastián Ávila A.
 */
interface Im1 {
    default void metodo() {
        
    }
}
interface Im2 {
    void metodo();
}
class Cm1 {
    public void metodo() {
        
    }
}
public class MetodoHeredado extends Cm1 implements Im1, Im2{
    //public void metodo() {}
    public static void main(String[] args) {
        Stream.of(new Cm1(), new Cm1()).reduce(new Cm1(), (a, b) -> a);
    }
}
