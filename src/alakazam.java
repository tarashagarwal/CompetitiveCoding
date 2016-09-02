import java.io.IOException;

class alakazam {
	
	public static void main(String args[])throws IOException
	{
		FastScanner input =new FastScanner((System.in));

		int N=input.nextInt();
		int nos[]=new int[N];

		//String str[]=br.readLine().split(" ");
		
		for(int i=0;i<N;i++)
			nos[i]=input.nextInt();
		
		//str=br.readLine().split(" ");
		
		int S=input.nextInt()-1;
		int E=input.nextInt()-1;
		
		int ans=S;
		Boolean flag=false;
		
		if(ans==E)
		flag=true;
			
		while(ans!=E && ans<N && flag==false)
		{
			ans=nos[ans];
			if(ans==E)
				flag=true;
			
		}
		
		
		if(flag==true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}

 
