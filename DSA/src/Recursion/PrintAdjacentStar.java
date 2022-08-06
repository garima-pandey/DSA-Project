package Recursion;

public class PrintAdjacentStar {
	
	static String output = "";
	
	public static void printStar(String input, int i)
	{
		//append current character
		output = output + input.charAt(i);
		
		//if we reached last character
		if(i == input.length()-1)
			return;
		
//		if next character is same , append *
		if(input.charAt(i) == input.charAt(i+1))
			output = output + "*";
		
		printStar(input, i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "aabb";
		printStar(input, 0);
		System.out.println(output);

	}

}
