package com.sebastian.varios;

/**
 *
 * @author Sebastián Ávila A.
 */
public class CamposInterface {
  public static void main(String[] args) {
    Implementa i = new Implementa();
    System.out.println(i.campo);
    i.metodo();
    System.out.println(((Implementa)i).campo);
    i.estatico();
  }
}

class Implementa implements Campos {
  int campo = 1;
  public void metodo() {
    System.out.println("hola clase");
  }
  public static void estatico() {
    System.out.println("estatico clase");
  }
}

interface Campos {
  int campo = 0;
  default void metodo() {
    System.out.println("metodo interface");
  }
  public static void estatico() {
    System.out.println("estatico interface");
  }
}
