package Demo;

public class Pattern {

	public static void main(String[] args) 
	{
		int count=5;
		for(int i=1;i<=count;i++)
		{
			int v=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(v+" ");
				v=v+count-j;
			}
			System.out.println("");
		}
	}

}
