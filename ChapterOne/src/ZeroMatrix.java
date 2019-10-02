import java.util.Random;

public class ZeroMatrix 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int n = 6;
		int m = 5;
		int matrix[][] = new int[n][m];
		boolean zeroInColZero = false;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				matrix[i][j] = rand.nextInt(10);
			}
		}
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.print("\n\n");
		}
		System.out.print("\n\n");
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				if(matrix[i][j] == 0)
				{
					if(j == 0)
					{
						zeroInColZero = true;
					}
					else
					{
						matrix[i][0] = 0;
						matrix[0][j] = 0;
					}
				}
			}
		}
		
		for(int i = 1; i < n; i++)
		{
			if(matrix[i][0] == 0)
			{
				for(int j = 0; j < m; j++ )
				{
					matrix[i][j] = 0;
				}
			}
		}
		
		for(int j = 1; j < m; j++)
		{
			if(matrix[0][j] == 0)
			{
				for(int i = 0; i < n; i++ )
				{
					matrix[i][j] = 0;
				}
			}
		}
		
		if(m > 0 && m > 0 && matrix[0][0] == 0)
		{

			for(int j = 0; j < m; j++ )
			{
				matrix[0][j] = 0;
			}
		}
		
		if(m > 0 && m > 0 && zeroInColZero == true)
		{
			for(int i = 0; i < n; i++ )
			{
				matrix[i][0] = 0;
			}
		}
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.print("\n\n");
		}
	}

}
