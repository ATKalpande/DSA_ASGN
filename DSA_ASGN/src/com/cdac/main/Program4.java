package com.cdac.main;

import java.util.Scanner;

//4. Check whether the Given Numberis a Palindrome or NOT. 
public class Program4 {
	
	static int rev(int n, int temp)
	{
	    // base case
	    if (n == 0)
	        return temp;
	 
	    // stores the reverse
	    // of a number
	    temp = (temp * 10) + (n % 10);
	 
	    return rev(n / 10, temp);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		 int n = sc.nextInt();
		    int temp = rev(n, 0);
		     
		    if (temp == n)
		        System.out.println("yes");
		    else
		        System.out.println("no" );
	}
}
