package com.sebastian.interfaces.tc;

/**
 *
 * @author Sebastián Ávila A.
 */

interface House{
  public default String getAddress(){
     return "101 Main Str";
  }
}

interface Office {
  public static String getAddress(){
     return "101 Smart Str";
  }
}

interface WFH extends House, Office{
   private boolean isOffice(){ return true; }
}

class HomeOffice implements House, Office{
  public String getAddress(){
     return "R No 1, Home";
  }
}

public class TestClass2 {

  public static void main(String[] args) {
    Office off = new HomeOffice();
    // System.out.println(off.getAddress()); <-- USAR EL NOMBRE DE LA INTERFACE
  }
}
