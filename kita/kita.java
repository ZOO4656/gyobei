import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("整数値を入力してください");
		int x = Integer.parseInt(text.readLine());

		if(x % 2 == 0) {
			System.out.println("値は正の偶数です。");
		}else if(x % 2 == 1) {
			System.out.println("値は正の奇数です。");
		}else if(x < 0 && x % 2 == 0) {
			System.out.println("値は負の偶数です。");
		}else {
			System.out.println("値は負の奇数です。");
		}
	}
}
