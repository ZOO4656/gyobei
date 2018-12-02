import java.io.*;
import java.util.Random;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
		boolean playerTurn = true;
		int num = 0;
		while (num <= 19) {
			System.out.println("20を言ったら負けゲーム!! 現在の数字は"+ num +"です。 数字を入力してください。");
			playerTurn = true;
			int x = Integer.parseInt(text.readLine());
			if(x == 0 || x >= 4){
				System.out.println("1~3の数字を入力してください");
				continue;
			}
			num += x;
			if(num >= 20){
				break;
			}
			System.out.println("コンピューターのターン");
			playerTurn = false;
			Random ran = new Random();
			int dom = ran.nextInt(3) + 1;
			System.out.println("コンピューターの数字は"+(dom));
			num += dom;
			System.out.println("現在の数字は"+num+"です。");
			if(num >= 20){
				break;
			}
		}
		if(playerTurn == true) {
			System.out.println("ゲームの勝者はコンピュータです。");
		}else{
			System.out.println("ゲームの勝者はプレイヤーです。");
		}
	}
}
