

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UniqueBsts {

	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());
			int nos[]=new int[N];

			for(int i=0;i<N;i++)
				nos[i]=i;
			int memory[]=new int[N];
			System.out.println(calculate(1,N));
		}

	}


	public static int calculate(int start,int end)
	{
		int total=0;
		if(start>end)
			return 0;
		if(start==end)
			return 1;

		for(int i=start;i<=end;i++)
		{
			int N=calculate(start,i-1);
			int M=calculate(i+1,end);
			
			if(N==0 || M==0)
				total+=N+M;
			else if(N!=0 && M!=0)
				total+=N*M;
		}
		return total;
	}

}
