package com.sebastian.lambdas;

import java.io.Closeable;
import java.io.IOException;

interface Uno {
    static void hola() {
    }
}

interface Dos extends Uno {
    static void chao() {

    }
}

public class ESError implements Closeable {
    public void close() {
        Uno.hola();
        var a = new Uno(){};
        var d = new Dos(){};
        System.out.println("2-cerrado");
    }

    public static void main(String[] args) {
        try (final var x = new ESError()) {
            System.out.println("1-metodo");
            throw new IllegalArgumentException("error ES");
        } catch (IllegalArgumentException e) {
            System.out.println("3-atrapado");
        } finally {
            System.out.println("4-fin");
        }
    }
}

/*
class ESSError extends ESError {
    @Override
    public void close () throws IOException { // NO PUEDE

    }
}
*/