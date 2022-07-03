package Recursion;

public class LinearRecursion {
	
	static void func(int n)
	{
		if(n > 0)
		{
			System.out.println("Print First: "+n);
			func(n - 1);
			System.out.println("Print Last: "+(n + 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		func(3);

	}

}
