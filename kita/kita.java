import java.io.*;
import java.util.Random;

public class kita{
	public static void main( String[] args ) throws IOException {
		Test coin = new Test();
		for (int i = 1; i <= 10; i++) {
			coin.AddCoins(500, 1);
		}

		System.out.println(coin.GetCount(500));
		System.out.println(coin.GetAmount());
	}
}
