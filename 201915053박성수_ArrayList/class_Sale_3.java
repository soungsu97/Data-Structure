public class class_Sale_3 {

	public static void main(String[] args) {
        int sale[][][] = new int[][][] {{{11,35,65,187},{168,558,315,226}},
        		                       {{46,54,88,87},{79,124,221,512}}};
		
		for(int i=0; i<2; i++) {
			System.out.printf("<< %d ÆÀ >> %n",i+1);
		for(int j=0; j<4; j++) {
			for(int k=0; k<4; k++)
				System.out.printf("%d/4ºÐ±â: sale[%d][%d][%d]= %d%n", k+1,i,j,k,sale[i][j][k]);
			   System.out.println("===========================");
		}System.out.println();
	}
}
}
