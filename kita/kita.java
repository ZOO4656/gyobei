import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
			// int x = Integer.parseInt(text.readLine());
		int j = 1;
		for(int i = 2; i <= 7; i++) {
			j *= i;
			System.out.println(j);
		}
	}
}
