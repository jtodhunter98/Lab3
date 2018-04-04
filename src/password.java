import java.util.Scanner;

/**
 * 
 */

/**
 * @author todjord
 *
 */
public class password {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub		
		
		Scanner scan = new Scanner(System.in);
			
		
		System.out.println("Create a password with the following:");
		System.out.println("Between 6-10 characters");
		System.out.println("One uppercase letter");
		System.out.println("One numeric value");

		
		String input = scan.next();//user input
		scan.close();//close scanner
		
		int length = input.length();
		boolean upperCase = false;
		boolean correctLength = false;
		
		if (length >= 6)
		{
			if (length <= 10)
			{
				correctLength = true;
				
				for (char x : input.toCharArray())
				{
					if(Character.isUpperCase(x));
					{
						upperCase = true;
					}
				}
			}
		}
		
		
		
		if (correctLength == true)
		{
			if (upperCase == true)
			{
				System.out.println("Password saved successfully");
			}
		}
		
		
		
	}

}
