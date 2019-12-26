import java.util.Scanner;
public class BasicProgram {
	public static void main(String args[]){
		
		int regno;
		int sub1;
		int sub2;
		int sub3;
		System.out.println("Enter the regno,sub1,sub2,sub3 marks");
		Scanner sc=new Scanner(System.in);
		regno=sc.nextInt();
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
		
		int total=sub1+sub2+sub3;
		float average=total/3;
		
		if(sub1>=40 && sub2>=40 && sub3>=40)
		{
			System.out.println("Passed the exam");
			
		}
		else 
		{
			System.out.println("Failed the exam");
			
		}
		System.out.println("Marks for regno-" +regno+ " are total: " +total+ " and the average is:" +average);
	}

}
