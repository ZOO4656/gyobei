import java.io.*;
import java.util.Random;

public class kita extends Cat{
	public static void main( String[] args ) throws IOException {
		Cat nyanko = new Cat();
		nyanko.Name = "michan";
		nyanko.Age = 10;

		Dog inu = new Dog();
		inu.Name = "コロン";
		inu.Age = 9;

		nyanko.ShowProfile();
		inu.ShowProfile();

		nyanko.sleep();
		nyanko.Speak();
		inu.run();
		inu.Speak();

	}
}
