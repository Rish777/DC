package Demo;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any String");
		String s=scan.nextLine();
		scan.close();
		String s1=s.toLowerCase();
		String[]a=s1.split("\\s");
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					count++;
					a[j]="0";
				}
			}
			if(count>1&&a[i]!="0")
			{
				System.out.println(a[i]+ " "+count);
			}
		}
		

	}

}
