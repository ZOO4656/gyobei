import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(text.readLine());
		System.out.println(x);
		System.out.println(x*x);
		System.out.println(x*x*x);
	}
}
