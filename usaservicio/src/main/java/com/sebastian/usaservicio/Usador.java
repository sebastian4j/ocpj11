package com.sebastian.usaservicio;

import com.sebastian.jarservicio.Servicio;
import java.util.ServiceLoader;

/**
 * java -p lib/:usaservicio-0.0.1.jar -m usaservicio/com.sebastian.usaservicio.Usador
 *
 * @author Sebastián Ávila A.
 */
public class Usador {

  public static void main(String[] args) {
    ServiceLoader<Servicio> sl = ServiceLoader.load(Servicio.class);
    for (Servicio s : sl) {
      System.out.println("::" + s);
    }
  }
}
