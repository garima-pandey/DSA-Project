package Array;

public class LeaderElementOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {17, 19, 4, 6, 3};
		int max = 0;
		
		for(int i = arr.length-1; i >=0; i--)
		{
			if(arr[i] > max)
			{
				System.out.println("Leader Element is: "+arr[i]);
				max = arr[i];
			}
		}
	}
}
