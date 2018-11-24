import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("好きな寿司ネタを入力してください。0=さば,1=サバ,2=鯖,3=saba,4=sava,5=
mackerel,6=,鲭鱼");
		int x = Integer.parseInt(text.readLine());

		switch(x) {
			case 0:System.out.println("大吉");break;
			case 1:System.out.println("中吉");break;
			case 2:System.out.println("吉");break;
			case 3:System.out.println("半吉");break;
			case 4:System.out.println("末吉");break;
			case 5:System.out.println("小吉");break;
			case 6:System.out.println("凶");break;
		}
	}
}
