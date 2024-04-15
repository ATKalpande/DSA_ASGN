package cdac.dac.main;

import java.util.Scanner;

//10. Print Fibonacci Series in reverse order using Recursion
public class Program11 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int no=sc.nextInt();

		print(no,0,1);
	}
	
	public static void print(int no,int a,int b)
	{
		if(no==0)
			return;
		else
		{
			int c=a+b;
			print(no-1,b,c);
			System.out.print(c+" ");
		}
			
		
	}


}
