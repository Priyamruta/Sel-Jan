package daily.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a password");
		String password=sc.next();

		if(checkPassword(password))
		{
			System.out.println("Password is valid");
		}
		else 
		{
			System.out.println("invalid password");
		}
	}


	public static boolean checkPassword(String password) {
		boolean isAtlease10 =false;
		boolean isAllletterAndDigit =false;
		boolean isAtlease2letter2digit = false;
		boolean isAtleast1Caps=false;


		List<Character> chars = new ArrayList<Character>();

		for(int i =0; i<password.length();i++) {
			chars.add(password.charAt(i));
		}


		if(password.length()>=10) {
			isAtlease10 = true;
		}


		List<Character> letterList = new ArrayList<Character>();
		List<Character> digitList = new ArrayList<Character>();
		for(char ch: chars) {
			if(Character.isLetter(ch)||Character.isDigit(ch)) {
				isAllletterAndDigit = true;
			}
			else 
			{
				isAllletterAndDigit =false;
				System.out.println("Invalid password: Passowrd should contain all letters and digits");
				break;
			}
			if(Character.isUpperCase(ch)) {
				isAtleast1Caps=true;
			}

			if(Character.isLetter(ch)) {
				letterList.add(ch);
			}

			else if (Character.isDigit(ch)) {
				digitList.add(ch);
			}



		}

		if(letterList.size()>=2&&digitList.size()>=2) {
			isAtlease2letter2digit = true;
		}



		return isAtlease10&&isAllletterAndDigit&&isAtleast1Caps&&isAtlease2letter2digit;
	}


}
