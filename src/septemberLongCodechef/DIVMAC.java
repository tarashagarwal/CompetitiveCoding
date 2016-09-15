package septemberLongCodechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class DIVMAC {

	static HashMap<Integer,Integer> leastPrime= new HashMap<>();
	static HashMap<Integer,Integer>  primeNos=new HashMap<>();
	static HashMap<Integer,Integer> isPrime=new HashMap<>();
    static int previous;

	public static void main(String args[]) throws NumberFormatException, IOException
	{
		isPrime.put(2,1);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());

		while(T-->0)
		{
			String str[]=br.readLine().split(" ");

			int N=Integer.parseInt(str[0]);
			int M=Integer.parseInt(str[1]);

			String strnos[]=br.readLine().split(" ");

			int nos[]=new int[N];

			for(int i=0;i<N;i++)
				nos[i]=Integer.parseInt(strnos[i]);

			for(int i=0;i<M;i++)
			{
				String op[]=br.readLine().split(" ");

				int type=Integer.parseInt(op[0]);
				int L=Integer.parseInt(op[1]);
				int R=Integer.parseInt(op[2]);

				if(type==0)//update
				{
					for(int j=L-1;j<R;j++)
					{
						nos[j]=nos[j]/leastPrimeDivisor(nos[j]);
					}
				}
				else//get
				{
					int result=1;
					for(int j=L-1;j<R;j++)
					{
						result=Math.max(result,leastPrimeDivisor(nos[j]));
					}
					System.out.print(result+" ");
				}
			}
			System.out.println();

		}
	}


	public static int leastPrimeDivisor(int no)
	{
		if(isPrime.get(no)!=null)
			return no;

		Integer ans=leastPrime.get(no);
		if(ans!=null)
			return ans;

		int prime=2;
		
		while(prime<=Math.sqrt(no))
		{
			if(no%prime==0)
			{
				leastPrime.put(no,prime);
				return prime;
			}
			else
			{
				prime=nextPrime(prime);
				//isPrime.put(prime, true);
			}
		}

		leastPrime.put(no,no);
		return no;

	}


	public static int nextPrime(int no)
	{
		if(no==2)
		{
			return 3;
		}

		int prime=no;
		Integer ans=primeNos.get(prime);

		if(ans!=null)
			return ans;

		Boolean flag=false;
		
		while(!flag)
		{
			flag=true;
			prime+=2;
			if(isPrime.get(prime)!=null)
				return prime;
			
			int n=isPrime.get(no);
			for(int i=3;i<=Math.sqrt(prime);i++)
			{
				i=6*n-1;
				if(prime%i==0)
				{
					flag=false;
					continue;
				}
				 i=6*n+1;
				if(prime%i==0)
				{
					flag=false;
					continue;
				}
			}
		}
		isPrime.put(prime,isPrime.get(prime)==null?1:isPrime.get(prime)+1);
		primeNos.put(no,prime);
		return prime;
	}

}
