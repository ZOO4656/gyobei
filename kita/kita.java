import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("年齢を入力してください");
		int x = Integer.parseInt(text.readLine());
		System.out.println("あなたが生まれてからのおおよその日数は"+x*365+"日です");

	}
}
