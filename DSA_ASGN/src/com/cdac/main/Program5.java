package com.cdac.main;
//5. Write a Java Program to check whether the Given Number is Prime Number or NOT. 
public class Program5 {
	 static boolean isPrime(int n, int i)
	    {
	 
	       
	        if (n <= 2)
	            return (n == 2) ? true : false;
	        if (n % i == 0)
	            return false;
	        if (i * i > n)
	            return true;
	      
	        // Check for next divisor
	        return isPrime(n, i + 1);
	    }
	 
	 public static void main(String[] args) {
		  int n = 15;
		  
	        if (isPrime(n, 2)) 
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	}

}
