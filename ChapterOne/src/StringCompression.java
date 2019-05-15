import java.util.Random;

public class StringCompression 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int strLength = 10;
		String str = "";
		boolean repeatFound = false;
		
		while(str.length() < strLength)
		{
			char c = (char)(rand.nextInt(26) + 65);
			str = str + c;
			while(rand.nextInt() % 2 == 0 && str.length() < strLength)
				str = str + c;
		}
		System.out.println(str);
		
		System.out.println(compress(str));
	}
	
	public static String compress(String str)
	{
		StringBuilder strCompBuilder = new StringBuilder();
		int strIndex = 0;
		int letterCount;
		
		while(strIndex < str.length())
		{
			strCompBuilder.append(str.charAt(strIndex));
			letterCount = 1;
			
			while(strIndex + 1 < str.length() && str.charAt(strIndex) == str.charAt(strIndex + 1))
			{
				letterCount++;
				strIndex++;
			}
			
			strCompBuilder.append(letterCount);
			strIndex++;
		}
		String strComp = strCompBuilder.toString();
		
		return strComp.length() < str.length() ? strComp : str;
	}

}
