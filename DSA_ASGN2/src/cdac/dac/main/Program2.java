package cdac.dac.main;

import java.util.Scanner;

//2. Sum of natural numbers using recursion
public class Program2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int no=sc.nextInt();
		
		System.out.println(	print(no));
	
	}
	
	public static int print(int no)
	{
		if(no <=0)
		return 0;
	    else
		{
			
			return no+ print(no-1);
			
		}
	}

}
