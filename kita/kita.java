import java.io.*;
import java.util.Random;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		three();
		four();
		five();
	}
	public static void three() {
		int widhtCounter = 1;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < widhtCounter; j++) {
				System.out.print("$");
			}
			System.out.println("");
			widhtCounter++;
		}
		System.out.println("");
	}
	public static void four() {
		int widhtCounter = 1;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < widhtCounter; j++) {
				System.out.print("$");
			}
			System.out.println("");
			widhtCounter++;
		}
		System.out.println("");
	}
	public static void five() {
		int widhtCounter = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < widhtCounter; j++) {
				System.out.print("$");
			}
			System.out.println("");
			widhtCounter++;
		}
	System.out.println("");
	}
}
