import java.io.*;

public class kita{
	public static void main( String[] args ) throws IOException {
		BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
			// int x = Integer.parseInt(text.readLine());
			int strike = 0;
			int ball = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println("ストライク= 0 ボール= 1 ファウル= 3？");
			int x = Integer.parseInt(text.readLine());
			if(x == 0 ){
				strike +=1;
			}else if(x == 1){
				ball +=1;
			}
			if(x == 3 && strike < 2) {
				strike +=1;
			}

			if(strike == 3 || ball == 4){
				break;
			}
		}
			System.out.println(strike + "ストライク, " + ball + "ボール");
	}
}
