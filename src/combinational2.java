
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class combinational2 {
	static int check=0;
	static ArrayList<String> ans;
	public static void main(String args[]) throws NumberFormatException, IOException
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());

		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());
			String str[]=br.readLine().split(" ");

			int nos[]=new int[N];

			for(int i=0;i<N;i++)
				nos[i]=Integer.parseInt(str[i]);

			Arrays.sort(nos);
			check=0;
			ans=new ArrayList<String>();
			int K=Integer.parseInt(br.readLine());
			printCombination(nos,K,"",0);
			if(check==0)
				ans.add("Empty");
			//System.out.print("Empty");



			HashMap<String,Boolean> map=new HashMap<String,Boolean>();

			for(int i=0;i<ans.size();i++)
			{
				map.put(ans.get(i),true);
			}


			//			
			//			for (Map.Entry<String, Boolean> entry : map.entrySet())
			//			{
			//			    System.out.print(entry.getKey());
			//			}
			//			System.out.println();
			//			

			for(int i=0;i<ans.size();i++)
			{
				if(map.get(ans.get(i))==true)
				{
					map.put(ans.get(i), false);
					System.out.print(ans.get(i));
				}
			}
			System.out.println();
		}
	}

	public static void printCombination(int nos[],int sum,String str,int previous)
	{
		if(sum<0)
		{
			//System.out.println("Empty");
			return;
		}

		if(sum==0)
		{
			str=str.trim();
			ans.add("("+str+")");
			//System.out.print("("+str+")");
			check=1;
			return;
		}

		for(int i=previous;i<nos.length;i++)
			printCombination(nos,sum-nos[i],str+" "+nos[i],i+1);
	}
}
