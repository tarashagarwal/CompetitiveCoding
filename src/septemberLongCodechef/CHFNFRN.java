package septemberLongCodechef;

import java.util.*;
import java.io.*;

class CHFNFRN
{
	static int V; 
	static boolean visited[];

	public static boolean isBipartite(int G[][],int src,int th)
	{

		V=th;
		int colorArr[] = new int[V];
		for (int i=0; i<V; ++i)
			colorArr[i] = -1;


		colorArr[src] = 1;


		LinkedList<Integer>q = new LinkedList<Integer>();
		q.add(src);


		while (q.size() != 0)
		{
			int u = q.poll();
			visited[u]=true;
			for (int v=0; v<V; ++v)
			{

				if (G[u][v]==1 && colorArr[v]==-1)
				{

					colorArr[v] = 1-colorArr[u];
					q.add(v);
				}


				else if (G[u][v]==1 && colorArr[v]==colorArr[u])
					return false;
			}
		}

		return true;
	}


	public static void main (String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int T=Integer.parseInt(br.readLine());

		while(T-->0)
		{
			String str[]=br.readLine().split(" ");
			int N=Integer.parseInt(str[0]);
			int M=Integer.parseInt(str[1]);
			int rel[][]=new int[N][N];
			visited=new boolean[N];

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


//						for(int i=0;i<N;i++)
//						{
//							for(int j=0;j<N;j++)
//								System.out.print(rel[i][j]+" ");
//							System.out.println();
//						}

			//					 int rel[][] = {{0, 1, 0, 1},
			//					            {1, 0, 1, 0},
			//					            {0, 1, 0, 1},
			//					            {1, 0, 1, 0}};
						boolean check=false;
						
						for(int i=0;i<N;i++)
						{
							if(visited[i]==false)
							{
								visited[i]=true;
								check=true;
							if(!isBipartite(rel,i,N))
							{
								check=false;
								break;
							}
							
							}
							
						}

						//System.out.println(isBipartite(rel,0,N));
			if (check)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}
}
