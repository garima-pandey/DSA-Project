package Array;

public class BasicsQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		palindrome 
//		
//		n = 121 = 121 = p
//		n = 123 = 321 = np
		
		int n = 122;
//		int temp = n;
		int sum = 0;
		
		
		while(n > 0)
		{
			int r = n % 10; // 1, 2, 1
//			sum = sum * 10 + r; //1, 12, 121
			sum = sum + r;
			n = n / 10;// 12, 1, 0
		}
		
		//System.out.println("Reverse number is: "+sum);
		
		//sum of digits: 123 = 1 + 2 + 3 = 6
		System.out.println("sum of digits: "+sum);
		
//		if(temp == sum)
//		{
//			System.out.println("Palindrome Number");
//		}
//		else {
//			System.out.println("Not Palindrome Number");
//		}
		
		//factorial
		
//		int fact = 1;
//		int n = 5;
//		
//		for(int i = 1; i <= n; i++)
//		{
//			fact *= i;// 1, 2, 6, 24, 120 
//		}
//		
//		System.out.println("Factorial is: "+fact);

	}

}
