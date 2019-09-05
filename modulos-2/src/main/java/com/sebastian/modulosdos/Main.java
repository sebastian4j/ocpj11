package com.sebastian.modulosdos;

import com.sebastian.modulosuno.dominio.Mascota;
import com.sebastian.modulosuno.dominio.Persona;

/**
 * utiliza las clases de <b>modulos-1</b>
 * @author Sebastián Ávila Á.
 */
public class Main {
  public static void main(String[] args) {
    final var persona = new Persona("persona uno", 1);
    final var mascota = new Mascota("mascota uno", 1);
    System.out.println(persona);
    System.out.println(mascota);
  }
}
