
public class IsRotation {

	public static void main(String[] args) {
		String str1 = "I Love New York";
		String str2 = "I Love New York";
		System.out.println(isRotation(str1, str2));
	}
	
	public static boolean isRotation(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			return false;
		}
		if(str1.length() == 0)
		{
			return true;
		}
		for(int i = 0; i < str1.length(); i++)
		{
			if(str2.indexOf(str1.substring(0, i+1)) == -1)
			{
				if(str1.substring( i, str1.length()).equals(str2.substring(0, str2.length() - i)))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}

		return true;
	}

}
