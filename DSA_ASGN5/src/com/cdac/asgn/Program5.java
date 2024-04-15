package com.cdac.asgn;

import java.util.ArrayList;
import java.util.Arrays;

public class Program5 {

	
	private static void mergeSort(int arr[],int l,int h)
	{
		int mid = (l+h)/2;
		if(l<h)
		{
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, h);
			mergeArr(arr,l,mid,h);
		}
		
	}
	
	private static void mergeArr(int a[],int l,int mid,int h)
	{
		ArrayList<Integer>temp = new ArrayList<Integer>();
		int left = l;
		int right = mid+1;
		
		while(left<=mid && right <=h)
		{
			if(a[left] <=a[right])
			{
				temp.add(a[left]);
				//temp[left] = a[left]
				left++;
			}
			
			else {
				temp.add(a[right]);
				right++;
			}			
		}
		
		//if left has some element
		
		while(left<=mid)
		{
			temp.add(a[left]);
			left++;
		}
		
		 //  if elements on the right half are still left //
		while(right<=h)
		{
			temp.add(a[right]);
			right++;
		}
		
		
		 // transfering all elements from temporary to arr //
        for (int i = l; i <= h; i++) {
            a[i] = temp.get(i - l);
        }
		
	}
	
	public static void dispArr(int a[])
	{
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void main(String[] args) {
		int arr[]= {11,2,4,2,1,12,20};
		
		int n = arr.length;
		
		dispArr(arr);
		
		
		mergeSort(arr,0,n-1);
		System.out.println(" ");
		dispArr(arr);
	}

}
