package Array;

public class NonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "garima";
		
		System.out.println("The given string is: "+str);
		
		for(int i = 0; i < str.length(); i++)
		{
			boolean unique = true;
			
			for(int j = 0; j < str.length(); j++)
			{
				if(i != j && str.charAt(i) == str.charAt(j))
				{
					unique = false;
					break;
				}
			}
			if(unique) //true
			{
				System.out.println(str.charAt(i));
				break;
			}
		}

	}

}
