

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoGreaterThan {
public static void main (String[] args)throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		int K=Integer.parseInt(br.readLine());
		
		String str[]=br.readLine().split(" ");
		
		int nos[]=new int[K];
		
		for(int i=0;i<K;i++)
		{
		    nos[i]=Integer.parseInt(str[i]);
		}
		
		for(int i=0;i<K;i++)
		{
		    if(i==K-1)
		    {
		    nos[i]=-1;
		    break;
		    }
		    int maxValue=nos[i];
		    for(int j=i+1;j<K;j++)
		    {
		        if(maxValue<nos[j])
		        {
		        maxValue=nos[j];
		        break;
		        }
		    }
		    
		    if(maxValue!=nos[i])
		    nos[i]=maxValue;
		    else
		    nos[i]=-1;
		}
		
		for(int i=0;i<K;i++)
			System.out.print(nos[i]+" ");
}
}


