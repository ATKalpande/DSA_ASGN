package com.cdac.asgn;
//3. Selection Sort 
public class Program3 {
	public static void sort(int[] arr) // 5,22,1,7,6,12
	{
		for(int i=0;i<arr.length;i++)
		{
				int item=arr[i]; // 5
				int min=i; // 0
				
				for(int j=i+1;j<arr.length;j++)
				{
					if(item > arr[j])
					{
						item=arr[j];
						min=j;
					}
				}
				
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
				
				
		}
	}
	public static void display(int[] arr)
	{
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}
	
	public static void main(String[] args)
	{
	    int[] arr={5,22,1,7,6,12};
		display(arr);
		sort(arr);
		display(arr);
	}

}
