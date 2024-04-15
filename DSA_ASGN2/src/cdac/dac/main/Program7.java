package cdac.dac.main;

import java.util.Scanner;

//6. Print reverse of a string using recursion
public class Program7 {
	 public static String s="";
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a String : ");
			String str=sc.next();
			System.out.println(print(str,str.length()));
		
		}
		
		public static String print(String str,int no)
		{
			if(no==0)
				return "";
			else
				return str.charAt(no-1)+print(str,no-1);
			
		}
		

}
