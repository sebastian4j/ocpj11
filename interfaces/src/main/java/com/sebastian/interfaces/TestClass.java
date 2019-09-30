package com.sebastian.interfaces;

interface House{
  public default String getAddress(){
     return "101 Main Str";
  }
}

interface Office {
  public static String getAddress(){
     return "000";
  }
}

class HomeOffice implements House, Office{
  
}

class Test2 extends TestClass {
  // public void hola(){} <-- NO SE PUEDE CON CLASES
}

public class TestClass {
  
  static void hola(){}

  public static void main(String[] args) {
    new Test2().hola();
    House h = new HomeOffice();  //1
    System.out.println(h.getAddress()); //2    
  }
}
