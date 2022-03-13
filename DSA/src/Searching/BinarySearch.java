package Searching;

public class BinarySearch {
	
	public static int binarySearch(int arr[], int first, int last, int search)
	{
		int mid = (first + last) / 2;
		
		while(first <= last)
		{
			if(arr[mid] == search)
			{
				return mid;
			}
			else if(arr[mid] < search)
			{
				first = mid + 1;
			}
			else if(arr[mid] > search)
			{
				last = mid - 1;
			}
			
			mid = (first + last) / 2;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 3, 4, 9, 10, 20, 35, 90};
		
		int search = 35;
		
		int result = binarySearch(arr, 0, arr.length-1, search);
		
		if(result == -1)
		{
			System.out.println("Search value is not found");
		}
		else {
			System.out.println("Search value is found "+(result+1));
		}

	}

}
