package Default;

public class MaxArray 
{
	public static void main(String[] args)
	{
		int max=0,max1=0;
		int[] a1= {-1,2,3,4,5,6,7};
		for(int i=0;i<=a1.length-1;i++)
		{
			
			
				if(max<a1[i])

					max =a1[i];
				else if(max1>a1[i])
					max1=a1[i];			
		}
		System.out.println("Maximum element of array is  "+max);
		System.out.println("Mainimum element of array is  "+max1);
	}

}
