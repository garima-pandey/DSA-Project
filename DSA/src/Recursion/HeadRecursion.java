package Recursion;

public class HeadRecursion {
	
	static void func(int n)
	{
		if(n > 0)
		{
			func(n - 1);
			System.out.println("Print: "+n);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		func(3);
		
	}

}
