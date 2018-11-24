import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("曜日を入力してください。0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int x = Integer.parseInt(text.readLine());

		System.out.println("来院時間を入力してください。0=午前、1=午後、2=夜間");
		int y = Integer.parseInt(text.readLine());

		if(x < y && x % 2 == 0 && y % 2 == 0) {
			System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );
		}

		if(x == y && x < 0) {
		    System.out.println( "xとyは等しく、かつ、負の数である。" );
		}

		if(x < y || x % 2 ==0) {
	    	System.out.println( "xはyより小さい、または、xは偶数である。" );
		}

		if(x <= 10 || x >= 100 && y >= 10 && y <= 100) {
	    	System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );
		}

		if(!(x < 0 && y < 0) {
	    	System.out.println( "xもyも負の数である、ではない。" );
		}
		}
	}
}
