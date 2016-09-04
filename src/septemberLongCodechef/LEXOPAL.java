package septemberLongCodechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LEXOPAL {

	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());

		while(T-->0)
		{
			String str=br.readLine();

			int L=str.length();
			

			int i=0;
			int j=L-1;
			
			Boolean flag=true;
			char ch='a';
			
			String str1="";
			String str2="";
			
		while(i<=j)
		{
			char first=str.charAt(i);
			char last=str.charAt(j);
			
			if(i==j)
			{
				if(first=='.')
					str1+=ch;
				else
					str1+=first;
			}
			else if(first==last)
				{
				if(first=='.' && last=='.')
				{
					str1+=ch;
					str2+=ch;
				}
				
				else
				{
					str1+=first;
					str2+=last;
				}
				}
			else
			{
				if(first=='.' && last!='.')
				{
					str1+=last;
					str2+=last;
				}
				else if(first!='.' && last=='.')
				{
					str1+=first;
					str2+=first;
				}
				else
				{
				flag=false;
				break;
				}
			}
			
			i++;
			j--;
		}
			if(flag==false)
				System.out.println("-1");
			else
				System.out.println(str1+reverse(str2));
		}
			
	}
	
	

	public static String reverse(String str)
	{
		String temp="";
		int L=str.length();

		for(int i=0;i<L;i++)
			temp+=str.charAt(L-i-1);
		return temp;
	}

}
