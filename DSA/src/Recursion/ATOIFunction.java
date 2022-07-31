package Recursion;

public class ATOIFunction {
	
	static int atoiFunction(String str, int n)
	{
		if(n == 1)
		{
			return str.charAt(0)-'0';
		}
		
		//if more than 1 digits recursive call for (n - 1)
		//multiply result with 10 and add last digit
		
		return (10 * atoiFunction(str, n-1) + str.charAt(n - 1)-'0');
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "400";
		int n = str.length();
		
		System.out.println(atoiFunction(str, n));

	}

}
