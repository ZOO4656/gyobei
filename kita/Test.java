import java.io.*;
import java.util.Random;

public class Test{
	private String Name;

    public void SetName( String nm ) {
        Name = nm;
    }

    public void ShowProfile() {
        System.out.println( "名前は、" + Name + "です。" );
    }
}
