

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintAllParenthesis {
	
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	 int N=Integer.parseInt(br.readLine());
	 
	 printAll(0,N,0,"");
		
	}
	
	public static void printAll(int open,int N,int close,String str)
	{
		if(close==N)
			System.out.println(str);
		else
		{
			if(open<N)
				printAll(open+1,N,close,str+"(");
			if(close<open)
				printAll(open,N,close+1,str+")");
		}
		
	}

}
