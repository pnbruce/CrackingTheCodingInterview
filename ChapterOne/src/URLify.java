
public class URLify
{
	public static void main(String[] args) 
	{
		char str[] = new char[500];
		
		String string = "I for one embrace our new robot overlords";
		int length = string.length();
	
		for(int i = 0; i < string.length(); i++)
		{
			str[i] = string.charAt(i);
		}
		
		System.out.println(toURL(str, length));
	}
	
	public static String toURL(char str[], int length)
	{
		int spaces = 0;
		for(int i = 0; i < length; i++)
		{
			if(str[i] == ' ')
			{
				spaces++;
			}
		}
		
		int urlLength = length + spaces * 2;
		
		int strPrintIndex = urlLength - 1;
		
		for(int i = length - 1; i >= 0; i--)
		{
			if(str[i] == ' ')
			{
				str[strPrintIndex--] = '0';
				str[strPrintIndex--] = '2';
				str[strPrintIndex--] = '%';
			}
			else
			{
				str[strPrintIndex--] = str[i];
			}
		}
		return new String(str);
	}
}
