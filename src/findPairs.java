

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class findPairs {
static int check=0;
static ArrayList<String> ans=new ArrayList<>();
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
			
			ArrayList<Integer> list=new ArrayList<>();
			
			int previous=0;
			
			for(int i=0;i<N;i++)
			{
				if(previous!=nos[i])
				{
					list.add(nos[i]);
					previous=nos[i];
				}
				
					
			}
			int V=list.size();
			int ele[]=new int[V];

			for(int i=0;i<V;i++)
			{
				ele[i]=list.get(i);
			}
            check=0;
			int K=Integer.parseInt(br.readLine());
			printCombination(ele,K,"",0);
			if(check==0)
				System.out.print("Empty");
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
			System.out.print("("+str+")");
			check=1;
			return;
		}

		for(int i=previous;i<nos.length;i++)
			printCombination(nos,sum-nos[i],str+" "+nos[i],i);
	}
}
