import java.util.Scanner;

public class Permutation 
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
		
		System.out.println("isPerm:" + isPermutation(str1, str2));
	}
	
	public static boolean isPermutation(String str1, String str2) 
	{
		
		if(str1.length() != str2.length())
		{
			return false;
		}
		
		int letterCount1[] = new int[256];
		int letterCount2[] = new int[256];
		
		for(int i = 0; i < (2^8); i++)
		{
			letterCount1[i] = 0;
			letterCount2[i] = 0;
		}
		
		for(int i = 0; i < str1.length(); i++)
		{
			int index = (int) str1.charAt(i);
			letterCount1[index]++;
		}
		
		for(int i = 0; i < str2.length(); i++)
		{
			int index = (int) str2.charAt(i);
			letterCount2[index]++;
		}
		
		for(int i = 0; i < (256); i++)
		{
			if(letterCount1[i] != letterCount2[i])
			{
				return false;
			}
		}
		
		return true;
	}
}


