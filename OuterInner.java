//Demonstration of Outer and Inner class which is inside the Outer class

public class Outer {
	int x;
	void display(){
		x=50;
		System.out.println(x);
		
	}
	private class Inner{
		int y;
		void output(){
			y=10;
			System.out.println(y);
		}
	}
	public static void main(String[] args){
		Outer outer=new Outer();
		outer.display();
		
		Outer.Inner inner=outer.new Inner();
		inner.output();
		
	}
	
	}
