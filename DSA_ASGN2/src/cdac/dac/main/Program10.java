package cdac.dac.main;

import java.util.Scanner;

//9. Recursive function to check if a string is palindrome
public class Program10 {
	static String s="";
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string");
		String str=sc.next();

		String f=print(str,str,str.length());
		if(str.equals(f))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
	
	public static String print(String str,String pali,int no)
	{
		if(no==0)
			return "";
	    else	
		return s=s+pali.charAt(no-1)+print(str,pali,no-1);
			
		
	}
	

}
