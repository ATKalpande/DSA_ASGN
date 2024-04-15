package com.cdac.asgn;
//7. Sorting Strings using Bubble Sort
public class Program7 {
	public static void sort(String[] arr) // 5,22,1,7,6,12
	{
		for(int i=0;i<arr.length-1;i++)
		{
				for(int j=0;j<arr.length-1-i;j++)
				{
					if(arr[j].compareTo(arr[j+1]) >0)
					{
						String temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
		}
	}
	public static void display(String[] arr)
	{
		for(String i:arr)
			System.out.print(i+" ");
		System.out.println();
	}
	
	public static void main(String[] args)
	{
	    String[] arr={"Akash","Suraj","Somesh","Nitin"};
	    display(arr);
		sort(arr);
		display(arr);
	}

}	
