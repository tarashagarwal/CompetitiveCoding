

import java.io.*;
import java.util.HashMap;


public class minimizeStringValue {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int T=Integer.parseInt(br.readLine());


		while(T-->0)
		{
			String str=br.readLine();
			int K=Integer.parseInt(br.readLine());
			
int len=str.length();

			if(K>len)
			{
				System.out.println("0");
				continue;
			}

			HashMap <Character,Integer>map =new HashMap<>();
			for(int i=0;i<len;i++)
			{
				char ch=str.charAt(i);
				if(map.get(ch)==null)
					map.put(ch,1);
				else
					map.put(ch,map.get(ch)+1);
			}

			for(int j=0;j<K;j++)
			{
				int maxFreq=Integer.MIN_VALUE;
				char ele='0';

				for(Character key:map.keySet())
				{
					int temp=map.get(key);

					if(temp>=maxFreq)
					{
						maxFreq=temp;
						ele=key;

					}

				}
				//System.out.println(ele);
int value=map.get(ele);
				if(ele!='0' && value!=0)
					map.put(ele, value-1);
				ele='0';
			}

			int ans=0;

			for(Character key:map.keySet())
				//System.out.println();
				ans+=Math.pow(map.get(key), 2);

			System.out.println(ans);
		}

	}
}
