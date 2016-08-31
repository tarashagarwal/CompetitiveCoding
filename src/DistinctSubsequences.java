import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistinctSubsequences {

	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());

		while(T-->0)
		{
			String s1=br.readLine();
			String s2=br.readLine();
			int N=s1.length();
			int M=s2.length();

			if(N<M)
				System.out.println(0+"");


			int i=0,j=0;
			int count=0;
			int temp=0;
			int sum=0;
			while(i<N && j<M)
			{

				if(s1.charAt(i)==s2.charAt(j))
				{
					if(i==0 || s1.charAt(i)!=s1.charAt(i-1))
					{
						i++;
						j++;
						count=1;
					}
					else
					{
						count++;
						i++;
						j++;
					}

				}
				else
				{

					while(s1.charAt(i)!=s2.charAt(j))
					{
						count++;
						temp++;
						i++;
					}

					sum+=nCM(count,temp);
					temp=0;
					count=1;

				}
			}

			System.out.println(sum);
		}
	}

	public static int nCM(int N,int M)
	{
		return fact(N)/((fact(N-M)*fact(M)));
	}

	public static int fact(int N)
	{
		if(N==1 || N==0)
			return 1;

		int ans[]=new int[N+1];
		ans[0]=1;

		for(int i=1;i<N+1;i++)
			ans[i]=i*ans[i-1];
		return ans[N];
	}

}
