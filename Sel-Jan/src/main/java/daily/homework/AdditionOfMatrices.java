package daily.homework;

public class AdditionOfMatrices {

	
	static Integer[][] Matrix1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,5,15,16}};
	static Integer[][] Matrix2 = {{16,15,14,13},{12,1,10,9},{9,7,6,5},{4,8,2,1}};
	
	static Integer AdditionMatrix[][] = new Integer[4][4];
	
	
	public static void main(String[] args) {
		
		for(int i =0; i <4;i++) {
			for(int j =0; j <4;j++) {
				AdditionMatrix[i][j]= Matrix1[i][j]+Matrix2[i][j];
				
			}	
		}
		
		for(int i =0; i<4;i++) {
			for(int j =0; j<4;j++) {
				System.out.print(AdditionMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	
	
}
