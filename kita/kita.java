import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
			// int x = Integer.parseInt(text.readLine());
			System.out.println("数字を入力してください");
			int x = Integer.parseInt(text.readLine());
		for(int i = 1; i <= x; i++) {
				System.out.println("*");
		}
	}
}
