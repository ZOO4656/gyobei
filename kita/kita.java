import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("中間試験の点数を入力してください");
		int x = Integer.parseInt(text.readLine());

		System.out.println("期末試験の点数を入力してください");
		int y = Integer.parseInt(text.readLine());

		if(x >= 60 && y >= 60) {
			System.out.println("合格");
		}else if(x + y >= 130) {
			System.out.println("合格");
		}else if(x + y >= 100 && x >= 90 || y >= 90) {
			System.out.println("合格");
		}else{
			System.out.println("失格");
		}
	}
}
