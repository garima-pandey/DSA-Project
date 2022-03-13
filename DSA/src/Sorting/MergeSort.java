package Sorting;

public class MergeSort {
	
	public static void mergeSort(int arr[], int n)
	{
		int temp[] = new int[n];
		
		for(int size = 1; size < n; size = size * 2)
		{
			int l1 = 0;
			int k = 0; // index of temp array
			
			while(l1 + size < n) // 1 < 9, 3 < 9
			{
				int h1 = l1 + size - 1; // 0, 2
				int l2 = h1 + 1; // 1, 3, 8
				int h2 = l2 + size - 1; // 1, 3, 15
				
				if(h2 >= n)
				{
					h2 = n - 1; // 8
				}
				
				//merge two pairs
				int i = l1;
				int j = l2;
				
				//temp: 11, 22
				while(i <= h1 && j <= h2)
				{
					if(arr[i] <= arr[j])
					{
						temp[k++] = arr[i++];
					}
					else {
						temp[k++] = arr[j++];
					}
				}
				
				while(i <= h1)
				{
					temp[k++] = arr[i++];
				}
				
				while(j <= h2)
				{
					temp[k++] = arr[j++];
				}
				
				//merge completed
				
				l1 = h2 + 1; // 2
			}
			
			//any pair left
			for(int i = l1; i < n; i++)
			{
				temp[k++] = arr[i];
			}
			
			for(int i = 0; i < n; i++)
			{
				arr[i] = temp[i];
			}
			
			System.out.println("\nSize of "+size +" elements are: ");
			for(int i = 0; i < n; i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {11, 22, 44, 33, 11, 66, 55, 88, 77};
		
		mergeSort(arr, arr.length);

	}

}
