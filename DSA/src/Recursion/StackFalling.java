package Recursion;

public class StackFalling {
	
	//print in sequence
	
	static void func(int n)
	{
		if(n == 0)
		{
			return;
		}
		
		func(n - 1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		func(5);

	}

}
