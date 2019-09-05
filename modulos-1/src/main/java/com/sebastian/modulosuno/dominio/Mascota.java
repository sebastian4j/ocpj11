package com.sebastian.modulosuno.dominio;

/**
 *
 * @author Sebastián Ávila Á.
 */
public class Mascota {
  private String nombre;
  private int edad;

  public Mascota() {}
  
  public Mascota(final String nombre, final int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }
  
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  @Override
  public String toString() {
    return "Mascota{" + "nombre=" + nombre + ", edad=" + edad + '}';
  }  
  
}
