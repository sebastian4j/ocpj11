package com.sebastian.lambdas;

import java.util.HashMap;
import java.util.function.IntFunction;

public class MapCompute {
    public static void main(String[] args) {
        final var map = new HashMap<Integer, String>();
        map.put(1, "11");
        map.put(2, "22");
        map.put(3, null);
        System.out.println("___");
        System.out.println("retorno: " + map.compute(4, (a,b) -> {
            System.out.println("clave buscado: " + a);
            System.out.println("valor asociado: " + b);
            return null;
        }));
        System.out.println("___");
        map.forEach((a, b) -> {
            System.out.println(a + " : " + b);
        });
        IntFunction<String>  ifn = x -> {
            return "";
        };
    }

    private void a() {
        return;
    }
}
