package Sorting;

public class InsertionSort {
	
	public static void insertionSort(int arr[], int n)
	{
		for(int i = 1; i < n; i++)
		{
			int temp = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > temp)
			{
				arr[j + 1] = arr[j];
				j = j - 1; // -1
			}
			
			arr[j + 1] = temp; // 34
		}
		
		System.out.println("Sorted List:");
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {64, 34, 25, 14, 20, 18, 30};
		
		insertionSort(arr, arr.length);

	}

}
