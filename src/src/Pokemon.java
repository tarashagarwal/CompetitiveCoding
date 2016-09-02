package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Pokemon {

	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int N=Integer.parseInt(br.readLine());
		int nos[]=new int[N];

		String str[]=br.readLine().split(" ");


		HashMap<Integer,Boolean> map=new HashMap<>();

		for(int i=0;i<N;i++)
		{
			nos[i]=Integer.parseInt(str[i]);
			map.put(nos[i],true);
		}

		int size=map.size();
		//System.out.println("Size="+size);

		ArrayList<Integer> list=new ArrayList<>();

		long ans=0;

		for(int i=0;i<N;i++)
		{
			HashMap <Integer,Boolean> temp=new HashMap<>();
			int count=0;
			for(int j=i;j<N;j++)
			{
				if(temp.get(nos[j])==null)
				{
					temp.put(nos[j],true);
					count++;
				}
				
				if(count==size)
				{
					//System.out.println(N-j);
					list.add(N-j);
					count=0;
					break;
				}

			}
		}



		for(int i=0;i<list.size();i++)
			ans+=list.get(i);

		System.out.println(ans);





	}

}
