package Searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[] = {2, 3, 4, 10, 23};
		
		int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter values in an Array:");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		int search;
		
		System.out.println("Enter any value to be search:");
		search = sc.nextInt();
		
		int i;
		
		for(i = 0; i < arr.length; i++)
		{
			if(arr[i] == search)
			{
				System.out.println("Search value is found at location "+(i+1));
				System.exit(0); // exit the program
			}
		}
		
		if(i == arr.length)
		{
			System.out.println("Search value is not found");
		}
		
	}

}
