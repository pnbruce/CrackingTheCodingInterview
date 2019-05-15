import java.util.Scanner;

public class OneAway 
{
	public static void main(String[] args) 
	{
		String str1;
		String str2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("str1:");
		str1 = scan.nextLine();
		System.out.println("str2:");
		str2 = scan.nextLine();
		scan.close();
		
		System.out.println(oneAway(str1, str2));
	}
	
	public static boolean oneAway(String str1, String str2)
	{
		if(Math.abs(str1.length() - str2.length()) > 1)
		{
			return false;
		}
		
		boolean changeFound = false;
		int str1Index = 0;
		int str2Index = 0;
		
		if(str1.length() - str2.length() == 1)
		{
			for(str1Index = 0; str1Index < str1.length(); str1Index++)
			{
				if(str2Index >= str2.length())
				{
					if(changeFound)
					 {
						 return false;
					 }
					 else
					 {
						 changeFound = true;
					 }
				}
				else if(str1.charAt(str1Index) != str2.charAt(str2Index))
				{
					 if(changeFound)
					 {
						 return false;
					 }
					 else
					 {
						 changeFound = true;
					 }
				}
				else
				{
					str2Index++;
				}
			}
		}
		else if(str1.length() - str2.length() == 0)
		{
			for(str1Index = 0; str1Index < str1.length(); str1Index++)
			{
				if(str1.charAt(str1Index) != str2.charAt(str2Index))
				{
					 if(changeFound)
					 {
						 return false;
					 }
					 else
					 {
						 changeFound = true;
						 str2Index++;
					 }
				}
				else
				{
					str2Index++;
				}
			}
		}
		else if(str1.length() - str2.length() == -1)
		{
			for(str2Index = 0; str2Index < str2.length(); str2Index++)
			{
				if(str1Index >= str1.length())
				{
					if(changeFound)
					 {
						 return false;
					 }
					 else
					 {
						 changeFound = true;
					 }
				}
				else if(str1.charAt(str1Index) != str2.charAt(str2Index))
				{
					 if(changeFound)
					 {
						 return false;
					 }
					 else
					 {
						 changeFound = true;
					 }
				}
				else
				{
					str1Index++;
				}
			}
		}
		
		return true;
	}
}
