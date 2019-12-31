package com.sebastian.varios;

import java.util.stream.Stream;

/**
 *
 * @author Sebastian Ávila Á.
 */
public interface Foo {
    String a = "1";
    boolean bar();
    
    default void otro() {}
}

interface Foo2 {
    String a = "2";
    boolean bar();
    
    String toString();
}




class Fooo implements Foo, Foo2 {   
    Foo2 f2 = () -> false;
    private void bar(int i) {}
    @Override
    public boolean bar() {
        Foo2 bol = new Foo() {
            @Override
            public boolean bar() {
                return false;
            }
        }::bar;
        Stream<Integer> str = Stream.of(1, 2, 3, 4);
        System.out.println(str.mapToInt(n -> n).sum());
        otro();
        Foo.super.otro();
        var var = 0;
        return false;
    }

}
