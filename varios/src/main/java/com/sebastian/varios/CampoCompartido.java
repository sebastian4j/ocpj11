package com.sebastian.varios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Consumer;

interface MyFoo {
    int number = 0;

    void calculate(int arg);

    public static void hola() {
    }

    public default void chao() {
        System.out.println("c h a o");
    }
}

class MyBar implements MyFoo {
    int number = 10;

    public void chao() {
        System.out.println("chao");
    }

    public void calculate(int arg) {
        MyFoo.super.chao();
        number += arg;
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = c1.andThen(System.out::println);
        c2.accept("HoLa");
        try {
            FileReader fr = new FileReader(new File("/home/sebastian/bin/teclas"));
            System.out.println(fr);
            try (fr) {
                System.out.println("en try");
            } catch (IOException e) {
                e.printStackTrace();
            }            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class Test {
    public static void main(String[] args) {
        MyFoo foo = new MyBar();
        foo.calculate(20);
        System.out.println(foo.number);
        foo.chao();
    }
}

public class CampoCompartido {
}
