
public class TypeCasting {
	public static void main(String[] args)
	{
		byte b=50;
		short s=b;	//Implicit Type Casting
		System.out.println(s);
		
		int x=32000;
		short s1=(short) x; 	//Explicit Type Casting
		System.out.println(s1);
	}

}
