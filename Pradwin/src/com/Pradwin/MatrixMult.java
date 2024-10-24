package com.Pradwin;

public class MatrixMult {
	public static void main(String args[]) {
		int[][] matrixA = {{1,2},{1,2}};
		int[][] matrixB = {{3,4},{3,4}};
		int[][] result = new int[2][2];
		
		for (int i = 0 ; i < matrixA.length ; i++) {
			for (int j = 0 ; j < matrixB.length ; j++) {
				for(int k = 0 ; k < result.length ; k ++) {
					result[i][j] += matrixA[i][k]*matrixB[k][j];
				}
			}
		}
		for(int[] i : result) {
			for(int j : i) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
