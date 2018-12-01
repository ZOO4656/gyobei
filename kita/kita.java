import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
			// int x = Integer.parseInt(text.readLine());
		int win = 0;
		int lose = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println("0か1の数字を入力してください。");
			int x = Integer.parseInt(text.readLine());
			if(x == 0) {
				lose += 1;
			}else{
				win += 1;
			}
		}
			System.out.println("勝ちの総数は" +win+ "負けの総数は"+lose);
	}
}
