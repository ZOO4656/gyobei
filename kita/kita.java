import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
			// int x = Integer.parseInt(text.readLine());
		int max = 0;
		int min = 0;
		for(int i = 1; i <= 10; i++) {
				int x = Integer.parseInt(text.readLine());
			if (max < x) {
				max = x;
			}
			if(min > x) {
				min = x;
			}
		}
		System.out.println("最大数値は" + max + "で最小値は"+min);
	}
}
