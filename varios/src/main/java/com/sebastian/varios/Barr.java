package com.sebastian.varios;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author Sebastian Ávila Á.
 */


interface Bar {

	static void bar() {
		System.out.println("bar estatico");
	}

	default void barr() {
		System.out.println("barr");
	}
}

class B {
	int i;
}

class BB extends B {
	int i;
}



interface A {
	void a();

	private void aa() {
	}
}

interface AA {
	int abcd = 0;

	default void a() {
		System.out.println("desde la interface" + abcd);
	}
}

class AAAA implements AA {
	public int abcd = 10;
}

abstract class AAA implements A, AA {
	public int abcd = 10;

	public void a(int a) {
	}

	public void a() {
		System.out.println("desde la implementación " + abcd);
		try (FileReader reader = new FileReader(new File(""))) {
			System.out.println("hola");
		} catch (IOException e) {
			// e = (IOException) new Exception(e); // se puede
			e.printStackTrace();
		}
	}
}

abstract class BarrAbs {
	int abs = 0;
}

public class Barr extends BarrAbs implements Bar {
	int br = 0;

	public static void main(String[] args) {
        AA aaa = new AAAA();
        System.out.println(aaa.abcd);
        new Barr().foo();
        int aa = 0;
        System.out.println("??");
        aaa.a();
        System.out.println("??");
        StringBuilder res = Stream.of("a", "b", "c")
				.parallel()
				.collect(StringBuilder::new,
        				StringBuilder::append,
        				(a,b) -> {
        					System.out.println("a: " + a);
        					System.out.println("b: " + b);
        					System.out.println("agregando");
        					b.append(a);
        					System.out.println("agregado");
        					System.out.println("a: " + a);
        					System.out.println("b: " + b);
        				});
        System.out.println(res);
        		
    }

	void foo() {
		Bar.super.barr();
		barr();
		Bar.bar();
		System.out.println("foo");
		Predicate<Integer> p1 = a -> a > 0;
		Predicate<Integer> p2 = a -> a < 3;
		List.of(1, 2, 3, 4, 5).stream().filter(p1.and(p2)).forEach(i -> System.out.println(i));
		System.out.println(":::::::::");
		List.of(1, 2, 3, 4, 5).stream().filter(p1).filter(p2).forEach(i -> System.out.println(i));

		Predicate<String> a = (s) -> {
			System.out.println(this.br);
			System.out.println(super.abs);
			return s.length() > 0;
		};
	}
}
