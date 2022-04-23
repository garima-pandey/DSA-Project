package Array;

public class RLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "wwwwaaadexxxxxx";
		
		for(int i = 0; i < str.length(); i++)
		{
			int count = 1;
			
			while(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1))
			{
				count++;
				i++;
			}
			
			System.out.print(str.charAt(i));
			System.out.print(count);
		}

	}

}
