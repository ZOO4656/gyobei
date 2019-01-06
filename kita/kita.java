import java.io.*;
import java.util.Random;

public class kita extends Cat{
	public static void main( String[] args ) throws IOException {
		Cat nyanko = new Cat();
		nyanko.Name = "michan";
		nyanko.Age = 10;

		nyanko.ShowProfile();
		nyanko.sleep();
	}
}
