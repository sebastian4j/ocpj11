package com.sebastian.jaruno;

/**
 * - javac -cp ../libs/lombok-1.18.8.jar $(find . -name "*.java") -d target 
 * 
 * - jar -cvf jar-1.jar -C target/ .
 * 
 * - java -cp jar-1.jar com.sebastian.jaruno.Main
 *
 * @author Sebastián Ávila A.
 */
public class Main {

  public static void main(String[] args) {
    System.out.println("hola desde " + Main.class.getPackageName());
  }
}
