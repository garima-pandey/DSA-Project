package Array;

public class PairSumOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 9, 6, 3, 1, 10, 4};
		int k = 9;
		
		int hash[] = new int[100];
		
		for(int i = 0; i < arr.length; i++)
		{
			int index = k - arr[i];
			
			if(hash[index] == 1)
			{
				System.out.println("Pair is "+arr[i]+" "+index);
				break;
			}
			
			hash[arr[i]] = 1;
		}
	}
}
