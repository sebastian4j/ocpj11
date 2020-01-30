package com.sebastian.varios;

import java.util.Optional;

public class Opt {
    public static void main(String[] args) {
        String str = Optional.<String>empty().orElse(null);
        System.out.println(str);
        Optional<String> o1 = Optional.empty();
    }
}