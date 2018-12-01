import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
			// int x = Integer.parseInt(text.readLine());
			int sum = 0;
		for(int i = 1; i > 0; i++) {
			System.out.println("数字を入力してください。ただし0を入力すると計算が終了します。");
			int x = Integer.parseInt(text.readLine());
			if(x != 0 ){
				sum +=x;
			}else if(x == 0) {
				break;
			}
		}
			System.out.println(sum);
	}
}
