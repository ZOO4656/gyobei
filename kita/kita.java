import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("何月か入力してください。0=1月,1=2月,2=3月,3=4月,4=5月,5=7月,6=9月,7=10月,8=11月,9=12月");
		int x = Integer.parseInt(text.readLine());

		switch(x) {
			case 0:System.out.println("元日、成人の日");
			case 1:System.out.println("建国記念の日");
			case 2:System.out.println("春分の日");
			case 3:System.out.println("昭和の日");
			case 4:System.out.println("憲法記念日、みどりの日、こどもの日");
			case 5:System.out.println("海の日");
			case 6:System.out.println("敬老の日、秋分の日");
			case 7:System.out.println("体育の日");
			case 8:System.out.println("化の日、勤労感謝の日");
			case 9:System.out.println("天皇誕生日");
		}
	}
}
