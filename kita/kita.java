import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
			// int x = Integer.parseInt(text.readLine());
			int t = 0;
		for(int i = 1; t <= 100; i++) {
			System.out.println("数字を入力してください");
			int x = Integer.parseInt(text.readLine());
			t += x;
			if(t >= 100){
				break;
			}
		}
			System.out.println(t);
	}
}
