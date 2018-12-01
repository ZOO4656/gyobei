import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
			// int x = Integer.parseInt(text.readLine());
			System.out.println("数字を入力してください");
			int x = Integer.parseInt(text.readLine());
			int t = 0;
		for(int i = 1; i <= x; i++) {
			t ++;
			if(t >= 10){
				t = 0;
			}
				System.out.println(t);
		}
	}
}
