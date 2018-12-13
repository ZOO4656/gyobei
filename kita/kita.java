import java.io.*;
import java.util.Random;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));

		int inputNumberHolder = 0;
		int[] countNumber = new int[10];
		while (inputNumberHolder <= 9) {
			System.out.println(inputNumberHolder+1+"目の数字を入力してください。");
			int x = Integer.parseInt(text.readLine());
			countNumber[inputNumberHolder] = x;
			inputNumberHolder ++;
		}
		for(int i = 0; i < 10; i++) {
			System.out.println((i+1)+"番目の数字を二倍した数字は"+countNumber[i]*2+"です。");
		}

	}
}
