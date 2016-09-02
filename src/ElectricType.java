import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import javax.swing.plaf.synth.SynthSpinnerUI;


/*Either do it or die*/


public class ElectricType {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());

		String str[]=br.readLine().split(" ");

		int nos[]=new int[N];

		for(int i=0;i<N;i++)
			nos[i]=Integer.parseInt(str[i]);

		//HashMap<Integer,Boolean> map=new HashMap<>();
		HashMap <Integer,Integer> first=new HashMap<>();
		HashMap<Integer,Integer> last=new HashMap<>();

		//ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> firstList=new ArrayList<>();
		ArrayList<Integer> lastList=new ArrayList<>();

		for(int i=0;i<N;i++)
		{
			if(first.get(nos[i])==null)
			{
				first.put(nos[i],i);
				firstList.add(i);
			}
		}
		//putting last occurrences

		for(int j=0;j<N;j++)
			last.put(nos[j],j);

		//putting in the lastList

		for(Map.Entry<Integer, Integer> entry:last.entrySet())
			lastList.add(entry.getValue());
		int arrayLast[]=new int[lastList.size()];

		for(int i=0;i<lastList.size();i++)
		{
			arrayLast[i]=lastList.get(i);
		}
		Arrays.sort(arrayLast);
		//System.out.println(firstList);
		//System.out.println(lastList);


		long sum=0;
		for(int i:firstList)
		{
			//System.out.println(Arrays.binarySearch(arrayLast,i));
			int t=Arrays.binarySearch(arrayLast,i);
			if(t<0)
				sum+=(lastList.size()+(t+1));
			else
				sum+=lastList.size()-t-1;
			//System.out.println(t+"    "+sum);
		}

		System.out.println(sum);
	}
}
