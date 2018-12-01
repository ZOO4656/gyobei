import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
			// int x = Integer.parseInt(text.readLine());
		int kyozin = 0;
		int hanshin = 0;
		for(int i = 1; i <= 9; i++) {
			for(int j = 0; j <= 0; j++) {
			System.out.println(i + "回表巨人の得点は？");
				int x = Integer.parseInt(text.readLine());
				kyozin += x;
			}
			System.out.println(i + "回裏阪神の得点は？");
				int x = Integer.parseInt(text.readLine());
				hanshin += x;
			}
		if (kyozin > hanshin) {
			System.out.println("巨人の勝ち");
		}else{
			System.out.println("阪神の勝ち");
		}
	}
}
