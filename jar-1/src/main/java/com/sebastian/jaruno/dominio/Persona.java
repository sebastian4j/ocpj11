package com.sebastian.jaruno.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Sebastián Ávila A.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Persona {
  private String nombre;
  private int edad;  
}
