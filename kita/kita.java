import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
		int j = 2;
			// int x = Integer.parseInt(text.readLine());
		for(int i = 0; i <= 6; i++) {
			j *= 2;
			System.out.println(j);
		}
	}
}
