package daily.homework;

import java.util.Arrays;
import java.util.Scanner;

public class lowerToUppercae {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.nextLine();
		String output = ConvertlowertoUpperCase(input);
		System.out.println("The formatted  string:"+output);
	}

		public static String ConvertlowertoUpperCase(String input)
		{ char  output[] = new char[input.length()];
			
			for(int i=0;i<input.length();i++)
			{
				int ch=input.charAt(i);
				if(ch>96&&ch<123)
				{
					
					output[i] = (char) (ch-32);
					
				}
				else if(ch==32) {
					output[i] = ' ';
				}
				
				else {
					output[i] = (char) ch;
				}
					
			
				
			}
			
			String returnString = String.valueOf(output);
			return returnString;

			
			

		}

	}
