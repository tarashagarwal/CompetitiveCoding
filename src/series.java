

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class series {
	
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		BigInteger ans;
		
		while(T-->0)
		{
			ans=new BigInteger("2");
			int no=Integer.parseInt(br.readLine());
			
			if(no%2==0)
			{
				int temp=no/2;
				
				ans=ans.pow((int) Math.pow(3,temp-1));
				
			}
			else
			{
                       int temp=no/2;
				
				ans=ans.pow((int) Math.pow(2,temp));
			}
			System.out.println(ans.toString());
		}
	}

}
