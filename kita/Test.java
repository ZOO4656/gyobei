import java.io.*;
import java.util.Random;

public class Test{
	private String Name;
	private int Age;

    public void SetName(String nm ) {
        Name = nm;
    }

    public void SetAge(int age) {
    	Age = age;
    }

    public void ShowProfile() {
        System.out.println( "名前は、" + Name + "です。" );
        System.out.println( "年齢は、" + Age + "歳です。" );
    }
}
