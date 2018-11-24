import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("変数xに入れる値を入力してください");
		int x = Integer.parseInt(text.readLine());

		System.out.println("変数yに入れる値を入力してください");
		int y = Integer.parseInt(text.readLine());

		if(x > y) {
			System.out.println("大きい数字は"+x);
		}else{
			System.out.println("大きい数字は"+y);
		}
	}
}
