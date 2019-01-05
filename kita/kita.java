import java.io.*;
import java.util.Random;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		sosu(10000,10100);
	}
	public static void sosu(int first, int end) {
		for(int i = first; i <= end; i++) {
			for(int j = 2; j <= (i/2); j++) {
				if(i % j != 0) {
					System.out.println(i);
					break;
				}else {
					break;
				}
			}
		}
	}
}
