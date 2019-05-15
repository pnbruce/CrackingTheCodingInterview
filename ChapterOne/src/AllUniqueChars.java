import java.util.Random;

public class AllUniqueChars {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int strLength = 10;
		String str = "";
		boolean repeatFound = false;
		
		for(int i = 0; i < strLength; i++)
		{
			str = str + (char)(rand.nextInt(26) + 65);
		}
		System.out.println(str);
		
		char strChars[] = str.toCharArray();
		heapStringSort(strChars, str.length());
		
		for(int i = 0; i < str.length(); i++)
			System.out.print(strChars[i]);
		System.out.print("\n");
		
		for(int i = 1; i < str.length(); i++)
		{
			if(strChars[i] == strChars[i - 1])
			{
				repeatFound = true;
				break;
			}
		}
		
		if(repeatFound)
		{
			System.out.println("all chars not unique");
		}
		else
		{
			System.out.println("all chars unique");
		}
	}
	
	public static void heapStringSort(char str[], int length)
	{
		for(int i = 0; i < length; i++)
		{
			heapify(str, length - i);
			swap(str, 0, length - i - 1);
		}
	}
	
	public static void heapify(char str[], int length)
	{
		int depth = (int) (Math.log(length)/Math.log(2));
		
		for(int i = (int) (Math.pow(2, depth) - 2); i >= 0; i--)
		{
			percolate(str, length, i);
		}
	}
	
	public static void percolate(char str[], int length, int parentIndex)
	{
		int leftIndex = parentIndex * 2 + 1;
		int rightIndex = parentIndex * 2 + 2;
		char parent = str[parentIndex];
		
		if((rightIndex) < length)
		{
			char left = str[leftIndex];
			char right = str[rightIndex];
			
			if(left > parent && right > parent)
			{
				int biggerIndex = left > right ? (leftIndex) : (rightIndex);
				swap(str, parentIndex, biggerIndex);
				percolate(str, length, biggerIndex);
			}
			else if(left > parent)
			{
				swap(str, parentIndex, leftIndex);
				percolate(str, length, leftIndex);
			}
			else if(right > parent)
			{
				swap(str, parentIndex, rightIndex);
				percolate(str, length, rightIndex);
			}
		}
		else if((leftIndex) < length)
		{
			char left = str[leftIndex];
			if(left > parent)
			{
				swap(str, parentIndex, leftIndex);
				percolate(str, length, leftIndex);
			}
		}
	}
	
	public static void swap(char str[], int index1, int index2)
	{
		char temp = str[index1];
		str[index1] = str[index2];
		str[index2] = temp;
	}

}


