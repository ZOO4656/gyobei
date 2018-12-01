import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
			// int x = Integer.parseInt(text.readLine());
		int j = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println("数字を入力してください。");
			int x = Integer.parseInt(text.readLine());
			j += x;
		}
			System.out.println(j / 10);
	}
}
