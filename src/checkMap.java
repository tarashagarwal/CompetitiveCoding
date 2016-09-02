import java.util.HashMap;

class Pair
{
	int one;
	int two;
}
	class checkMap {


	
	public static void main(String args[])
	{
		HashMap<Pair,Boolean> map=new HashMap<>();
		
		Pair pair1=new Pair();
		Pair pair2 =new Pair();
		
		pair1.one=1;
		pair2.two=2;
		
		pair2.one=1;
		pair2.two=2;
		
		map.put(pair1,true);
		map.put(pair2,true);
		
		System.out.println(map.size());
	}

}
