package com.sebastian.varios;

import java.util.stream.Stream;

/**
 *
 * @author Sebastián Ávila A.
 */
class test {
    static int add(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }
}
public class Data {
    int number;
    Data(int number) {
        this.number = number;
    }
    public static void main(String[] args) {
        Data d1 = new Data(1);
        Data d2 = new Data(2);
        Data d3 = new Data(3);
        var a = Stream.of(d1, d2, d3).parallel().reduce(new Data(0), (dd1,dd2)->{
            return new Data(dd1.number + dd2.number);
        }, (dd1, dd2) -> dd1);
        System.out.println(a.number);
    }
}
