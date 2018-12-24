import java.io.*;
import java.util.Random;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		doru(3,'$');
		parcent(5,'%');
		shapent(7,'#');
	}
	public static void doru(int x, char y) {
		int widhtCounter = 1;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < widhtCounter; j++) {
				System.out.print(y);
			}
			System.out.println("");
			widhtCounter++;
		}
		System.out.println("");
	}
	public static void parcent(int x, char y) {
		int widhtCounter = 1;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < widhtCounter; j++) {
				System.out.print(y);
			}
			System.out.println("");
			widhtCounter++;
		}
		System.out.println("");
	}
	public static void shapent(int x, char y) {
		int widhtCounter = 1;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < widhtCounter; j++) {
				System.out.print(y);
			}
			System.out.println("");
			widhtCounter++;
		}
	System.out.println("");
	}
}
