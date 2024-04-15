package cdac.dac.main;

import java.util.Scanner;

//1. Print 1 to n without using loops
public class Program1 {
	
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a no");
			int no=sc.nextInt();
			System.out.println("");
			print(no);
		
		}
		
		public static int print(int no)
		{
			if(no <=0)
			return 0;
		    else
			{
				
				 print(no-1);
				System.out.print(no+" ");
			return 0;
			}
		}

	
}
