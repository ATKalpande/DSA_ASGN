package com.cdac.main;
//2. Binary Search [Solution]
public class Program2 { int binarySearch(int arr[], int l, int r, int x)
{
    if (r >= l) {
        int mid = l + (r - l) / 2;

        if (arr[mid] == x)
            return mid;

        if (arr[mid] > x)
            return binarySearch(arr, l, mid - 1, x);

        return binarySearch(arr, mid + 1, r, x);
    }

    return -1;
}

// main function
public static void main(String args[])
{
    Program2 ob = new Program2();

    int arr[] = { 2, 3, 4, 10, 40 };
    int n = arr.length;
    int x = 10;
    int result = ob.binarySearch(arr, 0, n - 1, x);

    if (result == -1)
        System.out.println(
            "Element is not present in array");
    else
        System.out.println(
            "Element is present at index " + result);
}}
