import java.util.Random;

public class RotatePicture90 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int n = 6;
		int pic[][] = new int[n][n];
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				pic[i][j] = rand.nextInt(50);
			}
		}
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(pic[i][j] + "\t");
			}
			System.out.print("\n\n");
		}
		
		rotate90(pic, n);
		
		System.out.print("\n");
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(pic[i][j] + "\t");
			}
			System.out.print("\n\n");
		}
	}
	
	public static void rotate90(int[][] pic, int n)
	{
		int temp;
		
		for(int i = 0; i < Math.ceil(((double)n)/2); i++)
		{
			for(int j = 0; j < n/2; j++)
			{
				temp = pic[i][j];
				pic[i][j] = pic[j][n - 1 - i];
				pic[j][n - 1 - i] = pic[n - 1 - i][n - 1 - j];
				pic[n - 1 - i][n - 1 - j] = pic[n - 1 - j][i];
				pic[n - 1 - j][i] = temp;
			}
		}
	}

}
