import java.io.*;
import java.util.Random;

public class Test{
	private String Name;
	private int Age;
	private String Kind;

	Test(String kind) {
		this.Kind = kind;
	}

    public void SetName(String nm ) {
        this.Name = nm;
    }

    public void SetAge(int age) {
    	this.Age = age;
    }

    public void ShowProfile() {
        System.out.println( "名前は、" + this.Name + "です。" );
        System.out.println( "年齢は、" + this.Age + "歳です。" );
        System.out.println( "犬種は、" + this.Kind + "です。" );
        System.out.println("");
    }
}
