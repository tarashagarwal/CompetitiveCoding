

import java.util.Arrays;
import java.util.Scanner;

public class minCostForSimiliar {

	public static void main(String args[])
	{

		Scanner s=new Scanner(System.in);

		int T=s.nextInt();

		while(T-->0)
		{
			int N=s.nextInt();
			int K=s.nextInt();

			int ele[]=new int[N];

			int min=Integer.MAX_VALUE;
			int max=Integer.MIN_VALUE;

			int minCost=Integer.MAX_VALUE;

			for(int i=0;i<N;i++)
			{

				ele[i]=s.nextInt();

				if(ele[i]>max)
					max=ele[i];
				if(ele[i]<min)
					min=ele[i];


			}
			int cost[]=new int[N];
			int totcost=0;
			for(int i=min;i<=max;i++)
			{
				for(int j=0;j<N;j++)
				{
					if(ele[j]>i)
						cost[j]=(ele[j]-i)*5;
					else
						cost[j]=(i-ele[j])*3;
				}

				Arrays.sort(cost);

				for(int j=0;j<K;j++)
				{
					totcost+=cost[j];
				}

				if(minCost>totcost)
					minCost=totcost;
				totcost=0;
			}


			System.out.println(minCost);

		}
		s.close();
	}

}
