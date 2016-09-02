import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class findPairsSum {
	
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());

		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());
			
			int nos[]=new int[N];
			
			String str[]=br.readLine().split(" ");
			
			for(int i=0;i<N;i++)
			nos[i]=Integer.parseInt(str[i]);
			
			HashMap<Integer,String> map=new HashMap<>();
			ArrayList<String> list=new ArrayList<>();
			
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<N;j++)
				{
					String pulled=map.get((i+j)+"");
					if(nos[i]!=nos[j] && pulled==null)
					  map.put(nos[i],i+" "+j);
					else
						if(pulled.equals(""+(i+j)));
					    list.add(pulled);
				}
			}
			
			
			
			
			
			
			
			
			
				
		}
	}

}
