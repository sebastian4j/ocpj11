package com.sebastian.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Lambdas {
    public static void main(String[] args) {
        Consumer<Integer> c1 = System.out::print;
        Consumer<Integer> c2 = System.out::println;
        List.of(1, 2, 3).forEach(c1.andThen(c2));
        var listan = new ArrayList<Integer>();
        listan.add(1);
        listan.add(2);
        listan.add(3);
        listan.replaceAll(a -> a*a);
        listan.forEach(System.out::println);
        var lista = List.of(4, 5, 6);
        //lista.replaceAll(a -> a*a);
        lista.forEach(System.out::println);
        UnaryOperator<Integer> o;

        Consumer x = System.out::println;
        List.of(args).forEach(x);
    }
}

