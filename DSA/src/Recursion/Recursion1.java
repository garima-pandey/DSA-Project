package Recursion;

public class Recursion1 {
	
	static int func(int n) // 3, 2
	{
		if(n == 1) // base case or terminate condition or stop condition
		{
			return n;
		}
		
		//func(n - 1) // small problem
		int sum = n + func(n - 1); // processing logic
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sum of Digits
//		3 = 6
		
		int result = func(3);
		
		System.out.println(result);

	}

}
