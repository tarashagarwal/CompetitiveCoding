package septemberLongCodechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class LONGSEQ {

	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());

		while(T-->0)
		{
			String str=br.readLine();
			int N=Integer.parseInt(str);

			HashMap <Integer,Integer> map=new HashMap<>();

			int L= str.length();

			for(int i=0;i<L;i++)
			{
				int dig=N%10;
				if(map.get(dig)==null)
					map.put(dig,1);
				else
					map.put(dig,map.get(dig)+1);
				N/=10;
			}
			
			if((map.get(0)!=null && map.get(0)==1 )||(map.get(1)!=null && map.get(1)==1))
				System.out.println("Yes");
			else
				System.out.println("No");

		}

	}
}