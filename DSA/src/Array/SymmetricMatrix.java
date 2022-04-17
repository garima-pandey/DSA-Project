package Array;

import java.util.Scanner;

public class SymmetricMatrix {

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
		
		int temp[][] = new int[n][n];
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				temp[j][i] = arr[i][j];
			}
		}
		
		System.out.println("Transpose Matrix is:");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
		
		int count = 1; // symmetric matrix
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(arr[i][j] != temp[i][j])
				{
					count++; //2
					break;
				}
			}
		}
		
		if(count == 1)
		{
			System.out.println("Symmetric Matrix");
		}
		else {
			System.out.println("Not Symmetric Matrix");
		}
	}
}
