
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//S.C: O(1) and T.C: O(n)
		
		char arr[] = {'R', 'a', 'm'}; // O(n / 2)
		
		//Two-Pointer Approach
		
		int i = 0;
		int j = arr.length-1;
		
		while(i < j)
		{
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
		for(char n : arr)
		{
			System.out.print(n);
		}
		
		
//		for(int i = arr.length-1; i >= 0; i--)
//		{
//			System.out.print(arr[i]);
//		}
		
		
//		String name = "Garima";
//		
//		char arr[] = name.toCharArray();
//		
//		for(int i = arr.length-1; i >= 0; i--)
//		{
//			System.out.print(arr[i]);
//		}

	}

}
