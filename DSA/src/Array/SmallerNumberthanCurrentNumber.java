package Array;

public class SmallerNumberthanCurrentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {8, 1, 2, 2, 3};
//		arr[] = {4, 0, 1, 1, 3}
		int count = 0;
		int index = 0;
		
		int output[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++, index++)
		{
			count = 0;
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					count++;
				}
			}
			
			output[index] = count;
		}
		
		System.out.println("Array is:");
		for(int i = 0; i < output.length; i++)
		{
			System.out.print(output[i]+" ");
		}
	
	}

}
