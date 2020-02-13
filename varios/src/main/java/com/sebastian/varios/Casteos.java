package com.sebastian.varios;

import java.util.function.Function;

/**
 *
 * @author Sebastián Ávila A.
 */
interface Cast1 {
    void cast1(Integer in, Double db);
}
public class Casteos {
    double calculate(double number, Function<Integer, Double> f) {
        return f.apply((int)number);
    }
    public static void main(String[] args) {
        // var _ = 0; _ no se puede usar desde java 9
        Cast1 c1 = (a,b) -> {};
        // Cast1 c2 = (int a, double b) -> {}; // incompatible
        Cast1 c3 = (Integer a,Double b) -> {};
        Cast1 c4 = (var a, var b) -> {};  
        new Casteos().calculate(1, (a) -> {
            return (double) 0;
        });
    }
}
