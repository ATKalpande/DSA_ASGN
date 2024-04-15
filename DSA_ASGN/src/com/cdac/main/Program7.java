package com.cdac.main;

import java.util.Scanner;

//7. Write a Java Program to check whether the given number is Perfect Numberor NOT. 
public class Program7 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt(); // 421
		
		System.out.println("\n======================");
		int t1=no;
		int sum=0;
		for(int i=1;i<no;i++)
		{
			if(t1%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(no==sum)
				System.out.println("Perfect No.");
		else
				System.out.println("Not Perfect No.");

	}

}
