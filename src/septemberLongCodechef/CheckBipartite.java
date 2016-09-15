package septemberLongCodechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CheckBipartite
{
	private static int numberOfNodes;
	private static final int NO_OF_COLOR = 2;

	private static boolean isSafe(int vertex,int[][] adjacencyMatrix, int [] colored, int color)
	{
		for (int destination = 1; destination <= numberOfNodes; destination++)
		{
			if (adjacencyMatrix[vertex][destination] == 1 && colored[destination] == color)
			{
				return false;
			}
		}
		return true;
	}

	private static boolean checkBipartiteUtil(int adjacencyMatrix[][], int[] colored, int vertex)
	{
		if (vertex > numberOfNodes)
		{
			return true;
		}

		for (int colorNum = 1; colorNum <= NO_OF_COLOR; colorNum++)
		{
			if (isSafe(vertex, adjacencyMatrix, colored, colorNum))
			{
				colored[vertex] = colorNum;
				if (checkBipartiteUtil(adjacencyMatrix, colored, vertex + 1))
				{  
					return true;
				}
				else
				{
					return false;
				}
			}	
		}
		return false;
	}

	public static boolean checkBipartite(int adjacencyMatrix[][])
	{
		boolean bipartite = true;
		numberOfNodes = adjacencyMatrix[1].length - 1;
		int[] colored = new int[numberOfNodes + 1];

		for (int vertex = 1; vertex <= numberOfNodes; vertex++)
		{
			colored[vertex] = 0;
		}

		if (!checkBipartiteUtil(adjacencyMatrix, colored, 1))
		{
			bipartite = false;
		}
		return bipartite;
	}

	public static void main(String args[]) throws IOException
	{
		//int matrix[][]={{0,0,0,0},{0,0,1,1},{0,1,0,1},{0,1,1,0}};
		//System.out.println(checkBipartite(matrix));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int T=Integer.parseInt(br.readLine());

		while(T-->0)
		{
			String str[]=br.readLine().split(" ");
			int N=Integer.parseInt(str[0]);
			int M=Integer.parseInt(str[1]);
			int rel[][]=new int[N][N];

			for(int i=0;i<N;i++)
			{

				for(int j=0;j<N;j++)
				{
					if(i!=j)
						rel[i][j]=1;
					else
						rel[i][j]=0;

				}
			}

			for(int i=0;i<M;i++)
			{
				String temp[]=br.readLine().split(" ");
				int r1=Integer.parseInt(temp[0]);
				int r2=Integer.parseInt(temp[1]);

				rel[r1-1][r2-1]=0;
				rel[r2-1][r1-1]=0;

			}


			for(int i=0;i<N;i++)
			{
				for(int j=0;j<N;j++)
					System.out.print(rel[i][j]+" ");
				System.out.println();
			}

			//					 int rel[][] = {{0, 1, 0, 1},
			//					            {1, 0, 1, 0},
			//					            {0, 1, 0, 1},
			//					            {1, 0, 1, 0}};

			//System.out.println(checkBipartite(rel));
			numberOfNodes=N;
			if (checkBipartite(rel))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}