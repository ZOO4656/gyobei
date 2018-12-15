import java.io.*;
import java.util.Random;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));

		int inputNumberHolder = 0;
		int reverseNumber = 0;
		int chou_counter = 0;
		int han_counter = 0;
		int[] countNumber = new int[10];
		int[] chou = new int[10];	//偶数
		int[] han = new int[10];	//奇数
		while (inputNumberHolder <= 9) {
			System.out.println(inputNumberHolder+1+"目の数字を入力してください。");
			int x = Integer.parseInt(text.readLine());
			countNumber[inputNumberHolder] = x;
			inputNumberHolder ++;
			reverseNumber = inputNumberHolder;
		}
		for(int i = 0; i < inputNumberHolder; i++) {
			if(countNumber[i] % 2 == 0) {
				chou[chou_counter] = countNumber[i];
				chou_counter++;
			}else{
				han[han_counter] = countNumber[i];
				han_counter++;
			}
		}
		System.out.print("偶数");
		for(int i = 0; i < chou_counter; i++) {
			System.out.print(chou[i]+",");
		}
		System.out.println();
		System.out.print("奇数");
		for(int i = 0; i < han_counter; i++) {
			System.out.print(han[i]+",");
		}

	}
}
