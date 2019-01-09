import java.io.*;
import java.util.Random;

public class Dog extends Animal {
	public static void run() {
		System.out.println("トコトコ");
	}

	@Override
	public void Speak() {
		System.out.println("犬の鳴き声は、ワンワン");
	}
}

