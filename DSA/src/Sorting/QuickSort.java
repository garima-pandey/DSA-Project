package Sorting;

public class QuickSort {
	
	public static void quickSort(int arr[], int first, int last)
	{
		int i, j, pivot, temp;
		
		if(first < last)
		{
			pivot = first;
			i = first;
			j = last;
			
			while(i < j)
			{
				while(arr[pivot] >= arr[i] && i < last)
				{
					i++;
				}
				
				while(arr[pivot] < arr[j])
				{
					j--;
				}
				
				if(i < j)
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			temp = arr[pivot];
			arr[pivot] = arr[j];
			arr[j] = temp;
			
			//left sub-array
			quickSort(arr, 0, j - 1);
			//right sub-array
			quickSort(arr, j + 1, last);
		}
	}
	
	public static void printArray(int arr[])
	{
		System.out.println("Quick Sorted Array");
		for(int n : arr)
		{
			System.out.print(n+" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 3, 7, 5, 2};
		
		quickSort(arr, 0, arr.length-1);
		
		printArray(arr);

	}

}
