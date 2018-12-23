import java.io.*;
import java.util.Random;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(max(12,55,34));

	}
	public static int max(int x, int y, int z) {
		if(x > y && x > z) {
			return x;
		}else if(x < y && y > z){
			return y;
		}else if (x < z && y < z) {
			return z;
		}
		return x;
	}
}
