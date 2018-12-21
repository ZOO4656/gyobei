import java.io.*;
import java.util.Random;

public class Kita{
	public static void main( String[] args ) throws IOException {
		System.out.println("数字を入力してください。その数字を2乗します。");
		BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(nijo(5));

	}
		public static int nijo(int x) {
			return x * x;
		}
}
