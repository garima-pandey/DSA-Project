package Sorting;

public class BucketSort {
	
	public static void bucketSort(int arr[], int n)
	{
		int i, j;
		
		int count[] = new int[n + 1];
		
		for(i = 0; i < n; i++)
		{
			count[arr[i]]++;
		}
		
		for(i = 0, j = 0; i <= n; i++)
		{
			while(count[i] > 0)//2
			{
				arr[j++] = i; // j = 1, 1
				count[i]--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5, 1, 7, 8, 2, 4, 3, 1, 6, 5};
		
		bucketSort(arr, arr.length);
		
		System.out.println("Sorted Array is: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
