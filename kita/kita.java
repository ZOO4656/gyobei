import java.io.*;
import java.util.Random;

public class Kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(average(5,7));

	}
		public static int average(int x, int y) {
			return (x + y)/2;
		}
}
