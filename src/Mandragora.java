import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Mandragora {

	public static void main(String args[])throws IOException
	{
		FastScanner in=new FastScanner(System.in);
		int T=in.nextInt();
		StringBuilder stringBuilder=new StringBuilder("");


		while(T-->0)
		{
			int N=in.nextInt();
			int nos[]=new int[N];

			//String str[]=br.readLine().split(" ");
			for(int i=0;i<N;i++)
				nos[i]=in.nextInt();
			Arrays.sort(nos);

			long []sum=new long[N+1];

			sum[0]=0;

			for(int i=1;i<N+1;i++)
				sum[i]=sum[i-1]+nos[i-1];

			long all=sum[N];
			long max=all;

			for(int i=1;i<N+1;i++)
				max=Math.max((long)(i+1)*(all-sum[i]),max);
			//BigInteger maxPoints=eatMandragora(nos,sum,0,N,1);
			stringBuilder.append(max+"\n");
			//System.out.println(maxPoints);
		}
		System.out.println(stringBuilder);
	}




	public static BigInteger eatMandragora(int nos[],int sum,int i,int N,int st)
	{
		if(i==N)
			return BigInteger.valueOf(0);

		//fight first
		BigInteger fight=BigInteger.valueOf(nos[i]*st).add(eatMandragora(nos,sum-nos[i],i+1,N,st));
		BigInteger eat=eatMandragora(nos,sum-nos[i],i+1,N,st+1);

		if(fight.compareTo(eat)==1)
			return fight;
		else
			if(fight.compareTo(eat)==-1)
				return eat;
			else
				return fight;
	}

}

class FastScanner
{
	BufferedReader br;
	StringTokenizer st;

	public FastScanner(InputStream input)
	{
		br = new BufferedReader(new InputStreamReader(input));
		st = new StringTokenizer("");
	}

	public String next() throws IOException
	{
		if(st.hasMoreTokens())
		{
			return st.nextToken();
		}
		else
		{
			st = new StringTokenizer(br.readLine());
			return next();
		}
	}

	public int nextInt() throws IOException
	{
		return Integer.parseInt(next());
	}
}
