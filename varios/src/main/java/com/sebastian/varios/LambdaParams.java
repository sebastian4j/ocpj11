package com.sebastian.varios;

import java.util.stream.Stream;

class Cl1 {
    String mensaje = "holo";
}
interface In1 {
    static String mensaje = "hola";
    int sumar(int a, Long b);
}
interface In2 {
    void in2(String s);
}
class Cl2 extends Cl1 implements In1 {
    void mensaje() {        
        //System.out.println(mensaje);
    }
    @Override
    public int sumar(int a, Long b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
public class LambdaParams {  
    public static void in2(In2 in2) {
        in2.in2("");
    }
    public static void in1(In1 in1) {
        in1.sumar(1, 2L);
    }
    public static void main(String[] args) {
        In1 in1 = (int a, Long b) -> (int)(a + b);
        long a = 0;
        new Cl2().mensaje();
        in1((@Deprecated final var aa, var b) -> 0);
        in2(s -> s.length());        
    }
}
