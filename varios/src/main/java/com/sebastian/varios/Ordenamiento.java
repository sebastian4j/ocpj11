package com.sebastian.varios;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author Sebastián Ávila A.
 */
public class Ordenamiento implements Comparator<Ordenamiento> {
    private int numero;
    
    public Ordenamiento(int n) {
        numero = n;
    }
    
    @Override
    public int compare(Ordenamiento o1, Ordenamiento o2) {
        return o1.numero + o2.numero;
    }
    
    public static void main(String[] args) {
        List.of(new Ordenamiento(3), new Ordenamiento(1), new Ordenamiento(2))
                .stream().sorted(new Ordenamiento(0)).forEach(o -> System.out.println(o.numero));
        Stream.of(1).findAny().flatMap(e -> Optional.empty()).map(e -> 1);
    }
    
}
