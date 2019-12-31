package com.sebastian.var;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastián Ávila A.
 */
public class Var {

  public static void main(String[] args) {
    var a = new ArrayList<String>();
    System.out.println(a.getClass());
    List b = new ArrayList<String>();
    System.out.println(b.getClass());

    
    var sh = (short) 32767;
    switch (sh) {
      case 32767:
        break;
//      case 32768: no compila
//        break;
    }
    
    var ch = (char)1;
    switch (ch) {
      case 65535:
      break;
    }
    
  }
}
