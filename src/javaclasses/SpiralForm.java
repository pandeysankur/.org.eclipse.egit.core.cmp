package javaclasses;

public class SpiralForm {

	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 }, 
				{ 17, 18, 19, 20 } };
		int z = 0;
		int xAxisLength = mat[0].length;
		int yAxisLength = mat.length;
		System.out.println(xAxisLength);
		System.out.println(yAxisLength);
		int xStartPoint = 0;
		int yStartPoint = 0;

		for (int i = yStartPoint; i < yAxisLength; i++) {
			for (int j = xStartPoint; j < xAxisLength; j++) {

				if (i == yStartPoint) {
					System.out.print(mat[i][j] + " ");
				}

				if (j == xAxisLength - 1 && i != yStartPoint && i != yAxisLength - 1) {
					System.out.print(mat[i][j] + " ");
				}

				if (i == yAxisLength - 1) {
					System.out.print(mat[i][xAxisLength - 1 - j] + " ");
				}
				
				if(i== yAxisLength -1 && j == xAxisLength -1) {
					
					 for(int k = yAxisLength-1;k>yStartPoint;k--) {
						
						 System.out.print(mat[k][xStartPoint] + " ");
					 }
					 
//							System.out.print(mat[i-1][0] + " ");
//							System.out.print(mat[i-2][0] + " ");
//							System.out.print(mat[i-3][0] + " ");
					
					
				
					}
					
				}

			}

		}

	}


