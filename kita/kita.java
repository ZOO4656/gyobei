import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
			String sum = "#";
			int counter = 1;
			System.out.println("数字を入力してください。");
			int x = Integer.parseInt(text.readLine());
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < counter; j++){
				System.out.print(sum);
			}
				counter ++;
				System.out.println();
		}
	}
}
