package Default;


import java.util.Scanner;

public class Abcd
{
   public static void main(String args[])
   {
	   Scanner scan = new Scanner(System.in);
       int i, j,n,max ;
       System.out.println("Enter size of array");
       n=scan.nextInt();
       int arr[][] = new int[n][n];
       
	  
       
	   
       System.out.print("Enter " +(n*n)+ " Array Elements : ");
       for(i=0; i<arr.length; i++)
       {
           for(j=0; j<arr.length; j++)
           {
               arr[i][j] = scan.nextInt();
           }
       }
	   
       System.out.print("The Array is :\n");
       for(i=0; i<arr.length; i++)
       {
           for(j=0; j<arr.length; j++)
           {
               System.out.print(arr[i][j]+ "  ");
           }
           System.out.println();
       }
       for(i = 0; i < n; i++)
       {
       max = arr[0][i];
       for(j = 1; j < arr.length; j++)
       {
       if(arr[j][i] > max)
       {
       max = arr[j][i];
       }
       }
       System.out.println("Maximum elements are"+max);
       }

   }
}