
public class MethodOverloading {
	
	void add(int x,int y){
		System.out.println("int"+(x+y));
		System.out.println();
	}
	
	void add(float x,int y){
		System.out.println("float"+(x+y));
		System.out.println();
	}
		
	void add(String x,String y){
		System.out.println("String"+(x+y));
		System.out.println();
	}	
		
	void add(double x,double y){
		System.out.println("double"+(x+y));
		System.out.println();
	}	
	
	public static void main(String[] args)
	{
		MethodOverloading methods= new MethodOverloading();
		methods.add(20.87,45);
	}
	
	
	
	
	
	


}
