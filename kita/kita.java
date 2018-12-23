import java.io.*;
import java.util.Random;

public class Kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(max(12,7));

	}
		public static int max(int x, int y) {
			if(x > y) {return x;}else{return y;}
		}
}
