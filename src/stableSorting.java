

import java.util.*;

class Element
{
	int value;
	int index;
	int frequency;

}


class stableSorting {
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{

		int A[]={2,5,2,8,5,6,8,8};

		HashMap<Integer,Integer> map=new HashMap<>();

		int i;

		for(i=0;i<A.length;i++)
		{
			if(map.get(A[i])==null)
				map.put(A[i],1);
			else
				map.put(A[i], map.get(A[i])+1);

		}
		
		ArrayList<Element> list=new ArrayList<>();
		
		for(i=0;i<A.length;i++)
		{
			if(map.get(A[i])!=0)
			{
			   Element e=new Element();
			   e.value=A[i];
			   e.frequency=map.get(A[i]);
			   map.put(A[i], 0);
			   e.index=i;
			   
			   list.add(e);
			   
			   Collections.sort(list,new Comparator<Element>(){

					
				   public int compare(Element ob1, Element ob2) {	
						 if(ob1.frequency > ob2.frequency)
							 return 1;
//						 else if(ob1.frequency == ob2.frequency){
//							 if(ob1.index < ob2.index)
//								 return 1;
//							 else
//								 return 0;
//						 }
						 else
							 return 0;
					}
					
				});
			   
			}
			
			
		}
		
		for(i=0;i<list.size();i++)
		{
			System.out.print(list.get(i).value);
			System.out.println(" "+list.get(i).frequency);
		}
		
		
	}
	

}
