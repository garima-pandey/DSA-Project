package Recursion;

public class pattern1 {
	
	public static void pattern(int n, int row, int col) {
		
		if(row > n) // base case
		{
			return;
		}
		
		if(col > row)
		{
			System.out.print("\n");
			pattern(n, row + 1, 1);
			return;
		}
		
		System.out.print("*");
		pattern(n, row, col + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pattern(5, 1, 1);
		
	}

}
