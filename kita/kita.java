import java.io.*;
import java.util.Random;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("数字を入力してください。");
		int counter_x = 1;
		String peke = "x";

		int x = Integer.parseInt(text.readLine());
		int reverse_counter = x;

		for(int i = 0; i < x; i++) {
			for(int j = 0; j <= x ; j++) {
				if(j == counter_x ||j == reverse_counter) {
					System.out.print(peke);
				}else{
					System.out.print(" ");
				}
			}
			counter_x ++;
			reverse_counter --;
			System.out.println();
		}
	}
}
