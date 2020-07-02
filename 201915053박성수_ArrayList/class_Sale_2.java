public class class_Sale_2 {

	public static void main(String[] args) {
        int sale[][] = new int[][] {{11,35,65,187},{168,558,315,226}};
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++)
				System.out.printf("%d/4ºÐ±â: sale[%d][%d]= %d%n", j+1,i,j,sale[i][j]);
			                  
		}
	}
}
