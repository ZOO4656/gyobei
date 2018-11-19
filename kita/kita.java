public class kita{
	public static void main( String[] args ) {
		int x = 3;
		int y = 7;
		int z;

		z = x;
		x = y;
		y = z;

		System.out.println("x=" + x + ",y=" + y);
	}
}