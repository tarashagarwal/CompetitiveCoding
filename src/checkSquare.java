

import java.util.Arrays;
import java.util.Scanner;

public class checkSquare {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
	     int points[] =new int[8];
		
	     for(int i=0;i<8;i++)
	    	 points[i]=s.nextInt();
	    	 
	     float a=0,b=0;
		
	     for(int j=0;j<8;j=j+2)
	     a+=points[j];
	     a=a/4;
	     for(int j=1;j<8;j=j+2)
	     b+=points[j];
	     b=b/4;
	     
	     
	     float dis[]=new float[4];
	
	     dis[0]=(float)Math.sqrt(Math.pow(a-points[0],2)+Math.pow(b-points[1],2));
	     dis[1]=(float)Math.sqrt(Math.pow(a-points[2],2)+Math.pow(b-points[3],2));
	     dis[2]=(float)Math.sqrt(Math.pow(a-points[4],2)+Math.pow(b-points[5],2));
	     dis[3]=(float)Math.sqrt(Math.pow(a-points[6],2)+Math.pow(b-points[7],2));
		
	    // Arrays.sort(dis);
//		System.out.println(dis[0]);
//		System.out.println(dis[1]);
//	    System.out.println(dis[2]);
//	    System.out.println(dis[3]);
//		System.out.println(a);
//		System.out.println(b);
		
		if( dis[0]==dis[1] && dis[1]==dis[2] && dis[2]==dis[3] )
			System.out.println("1");
		else
			System.out.println("0");
		
		
	}

}//83 83 86 86 83 86 86 83
//60 91 27 64 27 41 37 73
