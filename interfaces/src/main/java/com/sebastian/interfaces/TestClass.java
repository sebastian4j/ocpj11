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
  //public void hola(){} //<-- NO SE PUEDE CON CLASES
  static void hola() {    
    System.out.println("segundo");
  }
}

public class TestClass {
  
  static void hola(){    
    System.out.println("primero");
  }

  public static void main(String[] args) {
    TestClass tc = new Test2();
    tc.hola();
    new Test2().hola();
    House h = new HomeOffice();  //1
    System.out.println(h.getAddress()); //2    
  }
}
