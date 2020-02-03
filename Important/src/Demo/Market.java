package Demo;
import java.util.*;
public class Market {
	static int amt,p,s,Sum_Dairymilk,Sum_Nestle,Sum_Cadbury,Total_Amt,Amt_Return,j=0;
	public static void main(String[] args) 
	{
		ArrayList<Integer>list=new ArrayList<Integer>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Select number of options you want.We have in total 3 options");
		s=scan.nextInt();
		
		if(s==3)
		{
			System.out.println("1 : Cabury");
			System.out.println("2 : Nestle");
			System.out.println("3 : Dairy_Milk  ");
		}
		else if(s==2)
		{
			System.out.println("1 : Cabury");
			System.out.println("2 : Nestle");
		}
		else
		{
			System.out.println("1 : Cabury");
		}
		
		for(int i=1;i<=s;i++)
		{
			
			System.out.println("Select your choice");
			int n=scan.nextInt();
			switch(n)
			{
			case 1:
			{
				
				int Cadbury=20;
				System.out.println("how many you want");
				p=scan.nextInt();
				Sum_Cadbury=p*Cadbury;
				list.add(Sum_Cadbury);
				System.out.println("Cadbury x "+p+" = "+Sum_Cadbury);
			}
			break;
			case 2:
			{
				
				int Nestle=45;
				System.out.println("how many you want");
				p=scan.nextInt();
				Sum_Nestle=p* Nestle;
				list.add(Sum_Nestle);
				System.out.println("Nestle x "+p+" = "+Sum_Nestle);
			}
			break;
			case 3:
			{
				int DairyMilk=180;
				System.out.println("how many you want");
				p=scan.nextInt();
				Sum_Dairymilk=p*DairyMilk;
				list.add(Sum_Dairymilk);
				System.out.println("DairyMilk x "+p+" = "+Sum_Dairymilk);
			}
			break;
			default:
			{
				System.out.println("Wrong Choice");
			}
			}
		}
		for(int k:list)
		{
			Total_Amt=Total_Amt+k;
		}
		
		System.out.println("Your total amount is "+Total_Amt);
		System.out.println("Enter amount given");
		amt=scan.nextInt();
		
		
		if(Total_Amt<=amt)
		{
			Amt_Return=amt-Total_Amt;
			System.out.println("Retun amount ="+Amt_Return);
			System.out.println(" Now Get Lost ");
			
		}
		scan.close();
	}

}
