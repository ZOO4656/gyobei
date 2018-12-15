import java.io.*;
import java.util.Random;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));

		int inputNumberHolder = 0;
		int reverseNumber = 0;
		int[] countNumber = new int[10];
		while (inputNumberHolder <= 9) {
			System.out.println(inputNumberHolder+1+"目の数字を入力してください。");
			int x = Integer.parseInt(text.readLine());
			countNumber[inputNumberHolder] = x;
			inputNumberHolder ++;
			reverseNumber = inputNumberHolder;
		}
		for(int i = 0; i < inputNumberHolder; i++ ) {
			reverseNumber --;
			System.out.println(reverseNumber+1+"番目の数字は"+countNumber[reverseNumber]+"です。");
		}
	}
}
