package daily.homework;

import java.util.Scanner;

public class SpiralMatrix {

	//static int matrixDimension = 4;
	//static Integer inputArray[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the matrix dimension");
		int matrixDimension = sc.nextInt();
		
		Integer inputArray[][] = new Integer[matrixDimension][matrixDimension];
		
		for(int i =0; i<matrixDimension; i++) {
			System.out.println("Please enter next row");
			for(int j =0; j<matrixDimension; j++) {
				System.out.println("Please enter next number");
				inputArray [i][j] =sc.nextInt();
			}
			
		}
		
		for(int i =0; i<4;i++) {
			for(int j =0; j<4;j++) {
				System.out.print(inputArray[i][j]+" ");
			}
			System.out.println();
		}
		
		
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<4;j++)
			{
			System.out.println(matrixDimension);
		}
			
		
		
		
	}
	
	}}
