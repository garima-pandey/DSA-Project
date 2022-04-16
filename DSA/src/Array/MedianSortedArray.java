package Array;

public class MedianSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr1 = {1, 2, 3, 4, 5}; 
		int[] arr2 = {6, 7, 8, 9, 10};
		
		int i, j, n;
		int m1, m2;
		
		i = j = 0;
		n = arr1.length;
		m1 = m2 = Integer.MIN_VALUE;
		
		for(int count = 0; count <= n; count++) // o(n)
		{
			if(i == n)
			{
				m1 = m2; // 5
				m2 = arr2[0]; // 6
				break;
			}
			else if(j == n)
			{
				m1 = m2;
				m2 = arr1[0];
			}
			
			if(arr1[i] <= arr2[j]) //1 < 6, 2 < 7
			{
				m1 = m2; //min, 1, 2, 3, 4
				m2 = arr1[i]; //1, 2, 3, 4
				i++; //1, 2, 3, 4
			}
			else {
				m1 = m2;
				m2 = arr2[j];
				j++;
			}
		}
		System.out.println("m1 "+m1);
		System.out.println("m2 "+m2);
		System.out.println((m1 + m2)/2);
	
	}
}
