package daily.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorsOfNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a Number : ");
		int number = Integer.parseInt(br.readLine());
		
		System.out.println("The prime factors are"+ NumbersFactors.primeFactors(number));		
		
		
		
		NumbersFactors NF = new NumbersFactors();	
		
		
		System.out.println("The factors are" + NF.factorsOfNum(number));

	}

	
}
