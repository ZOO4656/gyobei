import java.io.*;
import java.util.Random;

public class kita{
	public static void main( String[] args ) throws IOException {
		Test pomeranian = new Test("ポメラニアン");
		pomeranian.SetName("coron");
		pomeranian.SetAge(10);
		pomeranian.ShowProfile();

		Test pudol = new Test("プードル");
		pudol.SetName("maron");
		pudol.SetAge(15);
		pudol.ShowProfile();
	}
}
