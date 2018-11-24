import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("整数値を入力してください");
		int x = Integer.parseInt(text.readLine());

		if(x % 2 == 0) {
			System.out.println("値は偶数です。");
		}else{
			System.out.println("値は奇数です。");
		}
	}
}
