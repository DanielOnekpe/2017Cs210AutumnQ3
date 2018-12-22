package Examsn;
import java.util.*;
public class Q3_2017Autumn {
//big o complexity O(n^2)
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		String ar[] = new String [n];
		String x = "";
		sc.nextLine();
		
		for(int i = 0; i < n; i++)
		{
			ar[i] = sc.nextLine(); // user inputs data into the string
		}
		
		ar = sort(ar, n);
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(ar[i] + " ");
		}
		
		if(n % 2 != 0)
		{
			x = ar[(n/2)];
		}
		
		else
		{
			if(ar[n/2].compareTo(ar[(n/2)+1])>0)
			{
				x =  ar[(n/2)];
			}
			
			else
			{
				x = ar[(n/2) + 1];
			}
		}
		
		System.out.println();
		int comma = x.indexOf(" ");
		System.out.println(x.substring(0,comma));
	}
	
	public static String[] sort (String ar[], int n)
	{
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n-1; j++)
			{
				int x1 = ar[j].indexOf(" "); //gets the index of the space 
				int x2 = ar[j+1].indexOf(" "); //so as to seperate the string for the int 
				
				int p = Integer.parseInt(ar[j].substring(x1 + 1)); //gets the integer out of the string 
				int y = Integer.parseInt(ar[j+1].substring(x2 + 1)); //so we can sort based on the grades
				
				if(p > y) 
				{
					String temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}  	return ar;
	}
	
}
