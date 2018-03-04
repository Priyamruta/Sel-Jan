package daily.homework;

public class LesserNumberWithoutDigit {

	static Integer number = 143;
	static Integer digit = 8;
	
	
	public static void main(String[] args) {
		
		Integer lesserNumber = number-1;
		
		
		while(lesserNumber.toString().contains(digit.toString())) {
			lesserNumber = lesserNumber-1;
		}
		
		System.out.println("The lesser number is: "+ lesserNumber);
		
		
	}
	
	
}
