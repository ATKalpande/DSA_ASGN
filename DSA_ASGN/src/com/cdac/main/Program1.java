package com.cdac.main;

import java.util.Scanner;

//1. Write a Java Program to find GCD of two given numbers. 
public class Program1 {
	
	
	static int gcd(int a,int b)
	{
		if(a>b)
		{
				if(a%b==0)
			return b;
				else 
			return gcd(a,a-b);
		}
		else{
				if(b%a==0)
			return a;
				else 
			return gcd(b-a,b);
		}
		
	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first num:");
		int n1 = sc.nextInt();
		System.out.print("Enter the second num:");
		int n2 = sc.nextInt();
		System.out.print("GCD of "+n1+" And "+n2+" is "+gcd(n1, n2));
	}
}
