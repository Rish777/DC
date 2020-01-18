package Demo;
import java.util.*;

public class Account {

	public static void main(String[] args) 
	{	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter account number");
		String s=scan.nextLine();
		scan.close();
		for(int i=0;i<s.length()-4;i++)
		{
			char c=s.charAt(i);
			String s1=Character.toString(c);
			
			String s2=s1.replaceAll("[0-9]","x");
			String s3=s2.replaceAll(" ","");
			System.out.print(s3);
		}
		for(int j=s.length()-4;j<s.length();j++)
		{
			char c1=s.charAt(j);
			String s4=Character.toString(c1);
			System.out.print(s4);
		}
		
		

	}

}
