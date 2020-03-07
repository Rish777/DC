package Demo;

import java.util.ArrayList;

public class SubArraySplit {
	public static void main(String [] args)
	{
		ArrayList<Integer>arr=new ArrayList<Integer>();

		
		arr.add(5);
		arr.add(3);
		arr.add(-4);
		arr.add(10);
		int count=0;
		//System.out.println(arr);
		ArrayList<Integer>arr1=new ArrayList<Integer>();  
		for(int i=0;i<=arr.size();i++)
		{ 
			arr1.add(arr.remove(0));
			System.out.println(arr1+" "+arr);
			int sum=0;
			int sum1=0;
			
				for(int k:arr1)
				{
					sum=sum+k;
				}
				for( int j:arr)
				{
					sum1=sum1+j;
				}
				if(sum>sum1)
					count++;
				
				
			
		}System.out.println(count);
	}
}
