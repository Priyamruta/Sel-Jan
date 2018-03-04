package daily.homework;


public class MultiplesSum {

	public static void main(String[] args) {

		
		int i;
		int sum=0;
		
		for(i=1;i<=100;i++)
		{
			if(i%3==0 || i%5==0)
			{
				System.out.println("The multiples of 3 or 5 are: "+i);
				sum=sum+i;
				
			}
		}
		System.out.println("The sum=" +sum);

	}

}
