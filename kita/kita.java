import java.io.*;
import java.util.Random;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		kuku(3);
	}
	public static void kuku(int dan) {
		for(int i = 1; i <= 9; i++) {
			System.out.print(dan * i + ", ");
		}
	}
}
