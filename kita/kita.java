import java.io.*;
import java.util.Random;

public class kita extends Cat{
	public static void main( String[] args ) throws IOException {

Animal test[] = new Animal[4];

		for(int i = 0; i <= 4; i++) {
			if(i % 2 == 0) {

			}
		}

		Cat nyanko_0 = new Cat();
		Dog inu_1 = new Dog();
		Cat nyanko_2 = new Cat();
		Dog inu_3 = new Dog();

		test[0] = nyanko_0;
		test[2] = nyanko_2;
		test[1] = inu_1;
		test[3] = inu_3;

		nyanko_0.Name = "michan";
		nyanko_0.Age = 10;

		Dog inu = new Dog();
		inu_1.Name = "コロン";
		inu_1.Age = 9;

		nyanko_0.ShowProfile();
		inu.ShowProfile();

		nyanko_0.Sleep();
		nyanko_0.Speak();
		inu_1.Run();
		inu_1.Speak();

		nyanko_2.Speak();
		inu_3.Speak();
	}
}
