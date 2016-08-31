

import java.util.Stack;

public class StocksSpan {

	public static void main(String args[])
	{
		int input[]={6,3,4,5,2};
		int N=input.length;
		Stack<Integer> stack=new Stack<>();
		
		int span[]=new int[N];
		int p=0;
		for(int i=0;i<N;i++)
		{
			while(!stack.isEmpty() && input[i]>input[stack.peek()])
				stack.pop();

			if(stack.isEmpty())

				p=-1;
			else
				p=stack.peek();
			span[i]=i-p;
			stack.push(i);

		}
		
		
		for(int i=0;i<N;i++)
			System.out.println(span[i]);

	}

}
