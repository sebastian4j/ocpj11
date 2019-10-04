package com.sebastian.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Sebastián Ávila A.
 */
public class Nio {

  private static final Path P1_L = Paths.get("/finance/data/reports/daily/a.txt");

  public static void main(String[] args) throws IOException {
    System.out.println(P1_L.subpath(0, 1));
    System.out.println(Paths.get("/a").resolve(Paths.get("b")));
    System.out.println(Paths.get("a").resolve(Paths.get("/b")));
    System.out.println(Paths.get("/a").resolve(Paths.get("/b")));
    espacio();
    Files.list(Paths.get("/")).forEach(l -> {
      System.out.println(l);
    });
    espacio();
    Files.lines(Paths.get("/home/sebastian/java/oce-oca-ocp/ocp-817", "KEY")).forEach(l -> {
      System.out.println(l);
    });
    espacio();
    Files.find(Paths.get("/home/"), 3, (a, b) -> {
      return a.getFileName().toString().startsWith("a");
    }).forEach(System.out::println);
    espacio();
    System.out.println(Paths.get("/a/b/c").getNameCount());
    espacio();
    Path p1 = Paths.get("photos\\..\\beaches\\.\\calangute\\a.txt");
    Path p2 = p1.normalize();
    Path p3 = p1.relativize(p2);
    Path p4 = p2.relativize(p1);
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3.getNameCount());
    System.out.println(p4.getNameCount());
    espacio();
    System.out.println(Paths.get("/company/records/customers.dat").relativize(Paths.get("/b")));
    System.out.println(Paths.get("/company/records/customers.dat").relativize(Paths.get("/company/b")));
    System.out.println(Paths.get("company/records/customers.dat").relativize(Paths.get("company/b")));
    System.out.println(Paths.get("cc/company/records/customers.dat").relativize(Paths.get("company/b")));
    espacio();
    System.out.println(Paths.get("a/v").getRoot());
  }

  private static void espacio() {
    System.out.println("________________________________");
  }
}
