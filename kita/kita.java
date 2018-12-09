import java.io.*;
import java.util.Random;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("数字を入力してください。それが素数かどうか当てましょう");
		int x = Integer.parseInt(text.readLine());
		for(int j = 2; j <= 1000; j++) {
			boolean is_sosu = true;
			for(int i = 2; i < j/2; i++) {
				if(j % i == 0) {
					is_sosu = false;
					break;
				}
			}
			if(is_sosu) {
				System.out.println(j);
			}
		}
	}
}
