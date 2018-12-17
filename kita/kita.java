import java.io.*;
import java.util.Random;

public class Kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
		int kuku[][] = new int[9][9];
		//配列 kuku に値を代入する
		for( int i = 0 ; i < 9 ; i++) {
	   	 	for( int j = 0 ; j < 9 ; j++) {
	   	 		kuku[i][j] = (i+1)*(j+1);
	   	 		System.out.println(kuku[i][j]);
 			}
		}
	}
}
