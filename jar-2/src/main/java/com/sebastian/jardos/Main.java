package com.sebastian.jardos;

import com.sebastian.jardos.dominio.FiguraGeometrica;
import com.sebastian.jardos.dominio.MedioTransporte;
import com.sebastian.jaruno.dominio.Mascota;
import com.sebastian.jaruno.dominio.Persona;

/**
 * 
 * jar-2 ocupa el jar-1
 * 
 * javac -cp ../jar-1/jar-1.jar:../libs/lombok-1.18.8.jar $(find . -name "*.java") -d target
 * 
 * jar -cvf jar-2.jar -C target/ .
 * 
 * java -cp jar-2.jar:../jar-1/jar-1.jar com.sebastian.jardos.Main
 * 
 * @author Sebastián Ávila A.
 */
public class Main {
  public static void main(String[] args) {
    final var persona = new Persona("persona uno", 1);
    final var mascota = new Mascota("mascota uno", 1);
    final var figura = new FiguraGeometrica("figura uno");
    final var medio = new MedioTransporte("micro");
    System.out.println(persona);
    System.out.println(mascota);
    System.out.println(figura);
    System.out.println(medio);
  }
}
