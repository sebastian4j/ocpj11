package com.sebastian.lambdas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) {
        final var ex = new Exceptions();
        ex.ioexception();
    }

    public void ioexception() {
        try (FileReader reader = new FileReader(new File(""))) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
