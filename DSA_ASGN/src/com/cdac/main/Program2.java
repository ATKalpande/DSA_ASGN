package com.cdac.main;

import java.util.Scanner;

//2. Write a java program to LCM of TWO given number. 
public class Program2 {
	
	public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b); // Recursive call to find GCD
        }
    }

    // Function to find the LCM (Least Common Multiple) of two numbers
    public static int lcm(int a, int b) {
        // LCM = (a * b) / GCD(a, b)
        return (a * b) / gcd(a, b);
    }

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first num:");
		int n1 = sc.nextInt();
		System.out.print("Enter the second num:");
		int n2 = sc.nextInt();
		System.out.print("LCM of "+n1+" And "+n2+" is "+lcm(n1, n2));
	}
}
