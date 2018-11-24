import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("曜日を入力してください。0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int x = Integer.parseInt(text.readLine());

		System.out.println("来院時間を入力してください。0=午前、1=午後、2=夜間");
		int y = Integer.parseInt(text.readLine());

		if(y == 0 && x == 0||x ==2||x ==4) {
			System.out.println("休診");
		}else if(y == 1 && x == 0 || x == 6) {
			System.out.println("休診");
		}else if(y == 2 && x == 0||x == 3||x == 6) {
			System.out.println("休診");
		}else{
			System.out.println("○");
		}
	}
}
