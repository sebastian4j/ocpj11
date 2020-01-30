package com.sebastian.varios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Primera {
	Primera() {
		System.out.println("A");
	}
}

class Segunda extends Primera implements Serializable {
	Segunda() {
		System.out.println("B");
	}
}

class Tercera extends Segunda {
	Tercera() {
		System.out.println("C");
	}
}

public class Serializados {	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String fileName = "test.ser";
		Tercera input = new Tercera();
		try (var oos = new ObjectOutputStream(new FileOutputStream(fileName));
				var ois = new ObjectInputStream(new FileInputStream(fileName))) {
			oos.writeObject(input);
			ois.readObject();
		}
	}
}
