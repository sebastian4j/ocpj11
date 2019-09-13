package com.sebastian.modulosuno.dominio;

/**
 * javac $(find . -name "*.java") -d target
 * 
 * cd target
 * 
 * jar --create  --main-class com.sebastian.modulosuno.dominio.Main --file ../modulos-1.jar -c .
 * 
 * java -p modulos-1.jar -m com.sebastian.modulosuno
 * 
 * @author Sebastián Ávila A.
 *
 */
public class Main {
  public static void main(String[] args) {
    System.out.println("hola desde " + Main.class.getCanonicalName());
  }
}

