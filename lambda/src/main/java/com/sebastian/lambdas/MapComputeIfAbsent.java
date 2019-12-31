package com.sebastian.lambdas;

import java.util.HashMap;

public class MapComputeIfAbsent {
    public static void main(String[] args) {
        final var map = new HashMap<Integer, String>();
        map.put(1, "11");
        map.put(2, "22");
        map.put(3, null);
        System.out.println("___");
        System.out.println("retorno: " + map.computeIfAbsent(4, (a) -> {
            System.out.println("clave buscado: " + a);
            return "xxxx";
        }));
        System.out.println("___");
        map.forEach((a, b) -> {
            System.out.println(a + " : " + b);
        });
    }
}
