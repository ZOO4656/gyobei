import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("試験の点数を入力してください");
		int x = Integer.parseInt(text.readLine());

		if(x >= 60) {
			System.out.println("合格");
		}else {
			System.out.println("失格");
		}
	}
}
