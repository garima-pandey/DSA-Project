package Sorting;

public class ShellSort {
	
	public static void shellSort(int arr[], int n)
	{
		//int temp, i, j;
		//int s = n / 2; //size of shell - 5
		
		for (int s = n / 2; s > 0; s /= 2) { //size of shell
			
		    for (int i = s; i < n; i += 1) {
		    
		    	int temp = arr[i];// size of shell value
		    	int j;
		    
		    	for (j = i; j >= s && arr[j - s] > temp; j -= s) {
		      
		    		arr[j] = arr[j - s];
		    
		    	}
		    
		    	arr[j] = temp;
		    
		    }
		  
		}
		
//		while(s > 0)
//		{
//			for(i = s; i < n; i++) // 5
//			{
//				for(j = i - s; i >= 0; i = i - s)// 0
//				{
//					if((arr[j] > arr[j + s]))
//					{
//						temp = arr[j];
//						arr[j] = arr[j + s];
//						arr[j + s] = temp;
//					}
//					else {
//						break;
//					}
//				}
//			}
//			
//			s = s / 2;
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {11, 22, 44, 33, 11};
		
		shellSort(arr, arr.length);
		
		System.out.println("Sorted Array is: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
