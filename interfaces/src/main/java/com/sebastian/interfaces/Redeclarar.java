package com.sebastian.interfaces;

public interface Redeclarar {
  static void superEstatico() {}
  static void estatico() {}
  void superDefault();
  default void holo() {}
}


interface HijaRedeclara extends Redeclarar {
  void superEstatico();
  private void privado() {
    Redeclarar.super.holo();
  }
  default void hola() {}
  // static void superDefault() {} <-- NO PUEDE SER ESTATICO SI ESTA DEFINIDO NO ESTATICO
  static void estatico() {}
}

class Hola implements HijaRedeclara {
  public static void main(String[] args) {
    HijaRedeclara.estatico();
    new Hola().hola();
  }
  
  public void hola() {}
  @Override
  public void superDefault() {
    HijaRedeclara.super.hola();
    HijaRedeclara.super.holo();
    
  }

  @Override
  public void superEstatico() {
    // TODO Auto-generated method stub
    
  }
  
}
