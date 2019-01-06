import java.io.*;
import java.util.Random;

public class kita{
	public static void main( String[] args ) throws IOException {
		Test coin = new Test();
		for (int i = 1; i <= 10; i++) {
			coin.AddCoins(500, 1);
		}

		System.out.println("500コインの総枚数は"+coin.GetCount(500));
		System.out.println("500コインの総額は"+coin.GetAmount(500));
		System.out.println("100コインの総枚数は"+coin.GetCount(100));
		System.out.println("100コインの総額は"+coin.GetAmount(100));
		System.out.println("50コインの総枚数は"+coin.GetCount(50));
		System.out.println("50コインの総額は"+coin.GetAmount(50));
		System.out.println("10コインの総枚数は"+coin.GetCount(10));
		System.out.println("10コインの総額は"+coin.GetAmount(10));
		System.out.println("5コインの総枚数は"+coin.GetCount(5));
		System.out.println("5コインの総額は"+coin.GetAmount(5));
		System.out.println("1コインの総枚数は"+coin.GetCount(1));
		System.out.println("1コインの総額は"+coin.GetAmount(1));
		System.out.println(coin.GetCount());
		System.out.println(coin.GetAmount());
	}
}
