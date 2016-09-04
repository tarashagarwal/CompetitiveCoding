

import java.util.Scanner;

public class rotateBy90 {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		int T=s.nextInt();
		
		while(T-->0)
		{
			int K=s.nextInt();
			
			int[][] matrix=new int[K][K];
			
			for(int i=0;i<K;i++)
			{
				for(int j=0;j<K;j++)
				{
					matrix[K-j-1][i] = s.nextInt();
				}
			}
			
			
			
			for(int i=0;i<K;i++)
			{
				for(int j=0;j<K;j++)
				{
					System.out.print(matrix[i][j]+" ");;
				}
				System.out.println();
			}
			
			
		}
		
		
	}

}
