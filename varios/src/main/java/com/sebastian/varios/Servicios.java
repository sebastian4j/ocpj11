package com.sebastian.varios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ServiceLoader;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 *
 * @author Sebastián Ávila A.
 */
public class Servicios {

  static class Data {

    int number;

    Data(int number) {
      this.number = number;
    }
    @Override
    public String toString() {
      return "n: " + number;
    }
  }

  public static void main(String[] args) throws FileNotFoundException, IOException {
    ServiceLoader<String> loader = ServiceLoader.load(String.class);
    System.out.println("?" + List.of("a", "b")
            .parallelStream()
            .collect(String::new,
                    (a, b) -> a = a.concat(b),
                    (a, b) -> a = a.concat(b)));
    var fr = new FileReader(new File("/home/sebastian/bin/teclas"));

    try (fr) {
    }
    float factor = 2;
    calculate(3, (x) -> factor * x);

    Data data1 = new Data(1);
    Data data2 = new Data(2);
    System.out.println(Stream.of(data1, data2)
            .reduce(new Data(0),
                    (d1, d2) -> {
                      System.out.println("d1: " + d1.number);
                      System.out.println("d2: " + d2.number);
                      d2.number = d1.number + d2.number;
                return new Data(d1.number = d1.number + d2.number);
                    }
            )
    );
  }

  private static double calculate(int f, Function<Integer, Float> func) {
    return func.apply(f);
  }

}
