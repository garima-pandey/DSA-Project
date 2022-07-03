package Recursion;

public class IndirectRecursion {
	
	static void funcB(int n)
	{
		if(n > 1)
		{
			System.out.println(n);
			funcA(n / 2);
		}
	}
	
	static void funcA(int n)
	{
		if(n > 0)
		{
			System.out.println(n);
			funcB(n - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		funcA(10);

	}

}
