import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
			// int x = Integer.parseInt(text.readLine());
		for(int i = 0; i <= 9; i++) {
			System.out.println(i * 3);
		}
	}
}
