package Array;

import java.util.Scanner;

public class RotateMatrix90Degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter order of the matrix");
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		
		System.out.println("Enter values in Matrix");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Values in Matrix are:");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("90 degree rotated matrix is: ");
		for(int i = 0; i < n; i++)
		{
			for(int j = n - 1; j >= 0; j--)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}

	}

}
