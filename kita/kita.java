import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("月日を入力してください。0=１月,1=２月,2=３月,3=４月,4=５月,5=６月,6=７月,7=８月,8=９月,9=10月,10=11月,11=12月");
		int x = Integer.parseInt(text.readLine());

		switch(x) {
			case 0:System.out.println("31日です");break;
			case 1:System.out.println("２８日です");break;
			case 2:System.out.println("30日です");break;
			case 3:System.out.println("31日です");break;
			case 4:System.out.println("30日です");break;
			case 5:System.out.println("31日です");break;
			case 6:System.out.println("30日です");break;
			case 7:System.out.println("31日です");break;
			case 8:System.out.println("30日です");break;
			case 9:System.out.println("31日です");break;
			case 10:System.out.println("30日です");break;
			case 11:System.out.println("31日です");break;
			default:System.out.println("入力が間違っています");break;
		}
	}
}
