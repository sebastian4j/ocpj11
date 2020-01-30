package com.sebastian.varios;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Varios {

    public static void main(String[] args) {        
        Consumer<String> cs = s -> {return;};
        // var ioe = (IOException) new Exception(); // runtime error
        String[] arg = new String[] { "2" };
        System.out.println(Arrays.toString(arg));
        System.out.println(Paths.get("a/b/c").subpath(1, 2));
        Integer[] a = { 1, 2 };
        final List<Persona> personas = List.of(new Persona("elias"), new Persona("elias"));
        final List<Integer> listaEnteros = List.of(1, 2, 3, -1, 45);
        System.out.println(personas.stream().distinct().count());

        int xe = 0;
        System.out.println(listaEnteros.stream().min(Comparator.comparing(xes -> xe)));

        List<String> nombre = List.of("Sebastian", "Elias");
        System.out.println("___________________________");
        System.out.println(nombre.stream().reduce("-", (nn, nnn) -> nn.concat(nnn.toUpperCase())));
        System.out.println(nombre.stream().reduce((nn, nnn) -> nn.concat(nnn.toUpperCase())));
        System.out.println("____");
        localFoo(new Foo() {
            @Override
            public boolean bar() {
                return false;
            }
        }::bar);
        var list = new ArrayList<>(); // :Object
        var person = new Person("elias");
        Stream<Person> sp = Stream.of(person);
        sp.forEach(Person::print);
        System.out.println("_______________");
        Integer[] intarr = { 3, 2, 1 };
        Arrays.sort(intarr, (Integer ia, Integer ib) -> Integer.compare(ia, ib)); // no puede ser int
        final var listint = List.of(2, 3, 1);
        int listintres = listint.parallelStream().reduce(1, Integer::sum, (cma, cmb) -> cma * cmb);
        System.out.println("opt-red: " + listint.parallelStream().reduce(Integer::sum));
        System.out.println("opt-red: " + listint.parallelStream().reduce(1, Integer::sum));
        System.out.println("res: " + listintres);
        listint.stream().map(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer t) {
                return t;
            }

        });

        Function<String, String> f1 = s -> s.toLowerCase();
        Function<String, String> f2 = String::toUpperCase;
        System.out.println("compose: " + f1.compose(f2).apply("Java"));
        System.out.println("andThen: " + f1.andThen(f2).apply("Java"));

        System.out.println(Stream.<String>empty().findAny().or(() -> Optional.of("hola")));

        System.out.println(new C1().hola());
    }

    public static void localFoo(Foo foo) {
        System.out.println("recibido: " + foo.bar());
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    String print() {
        System.out.println(name);
        return name;
    }
    // static void print(Person p) {}
}

class C1 implements I1, I2 {
    public String hola() {
        return "c1 hola " + I2.super.hola();
    }
}

interface I1 {
    String hola();
}

interface I2 {
    default String hola() {
        return " I2 ";
    }
}
