//program to input your name and operations on that - printing in a specified pattern

import java.util.Scanner;
public class Inputname {
	public static void main(String[] args){
		String name;
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		System.out.println("The name you have entered is :"+name);
		StringBuffer sbname= new StringBuffer();
		sbname.append(name);
		
		System.out.println("length of the string is : "+name.length());
		
		int n=name.length();
		
		for(int i=0;i<n;i++)
		{		
		System.out.println(name.charAt(i));
		}
		
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{	
				
				System.out.print(name.charAt(j));
				
			}
			System.out.println();
			}
		
		
			
	}

}
