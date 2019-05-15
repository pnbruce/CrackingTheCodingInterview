import java.util.Random;

public class PermutationOfPalindrome 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int strLength = 3;
		String str = "";
		
		for(int i = 0; i < strLength; i++)
		{
			str = str + (char)(rand.nextInt(26) + 65);
		}
		
		System.out.println(str);
		System.out.println(palPerm(str));
	}
	
	public static boolean palPerm(String str)
	{
		int charCount[] = new int[256];
		
		for(int i = 0; i < 256; i++)
		{
			charCount[i] = 0;
		}
		
		for(int i = 0; i < str.length(); i++)
		{
			charCount[str.charAt(i)]++;
		}
		
		boolean oddFound = false;
		
		for(int i = 0; i < 256; i++)
		{
			if(charCount[i] % 2 == 1)
			{
				if(oddFound)
				{
					return false;
				}
				else
				{
					oddFound = true;
				}
			}
		}
		
		return true;
	}
}
