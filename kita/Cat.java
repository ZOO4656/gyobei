import java.io.*;
import java.util.Random;

public class Cat extends Animal {
    public static void sleep() {
        System.out.println("スースー");
    }

	@Override
	public void Speak() {
		System.out.println("猫の鳴き声は、ニャー");
	}

}