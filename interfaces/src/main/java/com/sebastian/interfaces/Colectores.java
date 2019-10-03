package com.sebastian.interfaces;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Sebastián Ávila A.
 */
class Book {

  int a;
  String b;

  public Book(int aa, String bb) {
    a = aa;
    b = bb;
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public String getB() {
    return b;
  }

  public void setB(String b) {
    this.b = b;
  }

  @Override
  public String toString() {
    return "Book{" + "a=" + a + ", b=" + b + '}';
  }

}

public class Colectores {

  /*static class Book {
    int a; String b;
    public Book(int aa, String bb) {a = aa;b = bb;}
  }*/
  public static void main(String[] args) {
    var books = List.of(new Book(1, "A"), new Book(2, "B"));
    books.stream().collect(Collectors.groupingBy(Book::getA)).forEach((a, b) -> {
      System.out.println(a + " " + b);
    });
    books.stream().collect(Collectors.partitioningBy(b -> b.getA() == 1)).forEach((a, b)->{
      System.out.println(a + " " + b);
    });
  }
}
