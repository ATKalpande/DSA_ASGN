package cdac.dac.main;

import java.util.Scanner;

//8. Tail recursion to calculate sum of array elements
public class Program9 {
	 static int sum=0;
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a no");
			int no=sc.nextInt();
			int[] arr=new int[no];
			
			while(no!=0)
			{
				arr[--no]=sc.nextInt();
			}
			
			System.out.println(	print(arr,arr.length));
		
		}
		
		public static int print(int[] arr,int no)
		{
			if(no==0)
			return 0;
		    else
			{
				sum=arr[no-1] + print(arr,no-1);  // 2 2 2 2
			//System.out.println(sum);
			}
				// 2 2 2 2
				return sum;
			
		}

}
