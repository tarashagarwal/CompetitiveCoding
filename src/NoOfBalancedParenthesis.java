

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoOfBalancedParenthesis {
   
   public static void main(String args[]) throws NumberFormatException, IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
   int T=Integer.parseInt(br.readLine());
   int x = 1;
   
   while(T-->0)
   {
       
       String str[]=br.readLine().split(" ");
       
       int N=Integer.parseInt(str[0]);
       int M=Integer.parseInt(str[1]);
       
       if(N<1 || M<1)
       {
           System.out.println("Case #"+(x++)+":"+"0");
           continue;
       }
       
       
       int min=Math.min(N,M);
       int ans[]=new int[min+1];
       ans[0]=1;
       if(min==1)
       {
           System.out.println("Case #"+(x++)+":"+"1");
           continue;
       }
       int i;
       for(i=1;i<min+1;i++)
       {
           ans[i]=ans[i-1]*3-1;
       }
       System.out.println("Case #"+(x++)+":"+""+ans[i-1]);
       
       
   }
   }

}