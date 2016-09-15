package septemberLongCodechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class  RESCALC{

	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());

		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());
			int scores[]=new int[N];

			for(int j=0;j<N;j++)
			{
				String str[]=br.readLine().trim().split(" ");
				int L=str.length;

				int K=Integer.parseInt(str[0]);

				HashMap<String,Integer> map=new HashMap<>();

				//int count=0;
				for(int i=1;i<L;i++)
				{
					String ch=str[i];
					if(map.get(ch)==null)
						map.put(ch,1);
					else
						map.put(ch,map.get(ch)+1);

				}
				scores[j]=K;

				Boolean flag=true;

				while(flag)
				{
					flag=false;
					int count=0;

					for(Map.Entry<String, Integer> entry:map.entrySet())
					{
						if(entry.getValue()!=0)
						{
							flag=true;
							map.put(entry.getKey(),entry.getValue()-1);
							count++;
						}
					}
					switch(count)
					{
					case 4:scores[j]+=1;
					break;
					case 5:scores[j]+=2;
					break;
					case 6:scores[j]+=4;
					break;
					default: break;
					}


				}
			}

			int maxScore=Integer.MIN_VALUE;
			int index=-1;


			HashMap<Integer,Integer> map2=new HashMap<>();

			for(int i=0;i<N;i++)
			{
				if(map2.get(scores[i])==null)
				{
					map2.put(scores[i],1);
					System.out.println(scores[i]);
				}
				else
				{
					map2.put(scores[i],map2.get(scores[i])+1);
				}

				if(maxScore<scores[i])
				{
					maxScore=scores[i];
					index=i;
				}
			}

			if(map2.get(maxScore)>1)
				System.out.println("tie");
			else
			{
				if(index==0)
					System.out.println("chef");
				else
					System.out.println(index+1);
			}

		}
	}

}
