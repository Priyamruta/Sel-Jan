package daily.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NumbersFactors {

	public static int primeFactors(int n) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a Number : ");
		n=Integer.parseInt(br.readLine());
		int i=2;
		while(n>1)
		{
			if(n%i == 0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
			else
				i++;
			

		}
		return i;

	}

	public int factorsOfNum(int num) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a Number : ");
		int n = Integer.parseInt(br.readLine());
		int i;
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				return i;

			}
		}
		return i;

	}

}
