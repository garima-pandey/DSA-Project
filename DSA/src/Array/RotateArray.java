package Array;

public class RotateArray {
	
	public static void reverse(int arr[], int index, int rotateTimes) {
		
		for(int i = index; i < rotateTimes; i++)
		{
			int temp = arr[i];
			arr[i] = arr[rotateTimes];
			arr[rotateTimes--] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {90, 1, 20, 2, 4, 6, 100};
		int rotateTimes = 3;
		
		reverse(arr, 0, rotateTimes - 1);
		
		System.out.println("1st Rotation");
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		
		reverse(arr, rotateTimes, arr.length - 1);
		
		System.out.println("\n2nd Rotation");
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		
		reverse(arr, 0, arr.length - 1);
		
		System.out.println("\n3rd Rotation");
		for(int i : arr)
		{
			System.out.print(i+" ");
		}

	}

}
