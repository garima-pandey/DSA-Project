package Dp;

public class FibMemoization {
	
	public static int fib(int n, int cache[])
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		
		//memoization
		if(cache[n] != 0)
		{
			return cache[n];
		}
		
		int first = fib(n -1, cache);
		int second = fib(n - 2, cache);
		
		int sum = first + second;
		
		cache[n] = sum;
		
		return cache[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Top -down Memoization
		
		int n = 5;
		
		int cache[] = new int[n + 1];
		
		System.out.println(fib(n, cache));

	}

}
