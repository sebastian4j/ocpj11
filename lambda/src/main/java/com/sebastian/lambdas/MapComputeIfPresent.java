package com.sebastian.lambdas;

import java.util.HashMap;

public class MapComputeIfPresent {
    public static void main(String[] args) {
        final var map = new HashMap<Integer, String>();
        map.put(1, "11");
        map.put(2, "22");
        map.put(3, "33");
        System.out.println("___");
        System.out.println("retorno: " + map.computeIfPresent(3, (a, b) -> {
            System.out.println("clave buscado: " + a);
            System.out.println("valor presente: " + b);
            return "xxxx";
        }));
        System.out.println("___");
        map.forEach((a, b) -> {
            System.out.println(a + " : " + b);
        });
    }
}
