package com.Pradwin;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0 ; i < num.length ; i++ ) {
			for(int j = 0 ; j < num[i].length ; j++) {
				System.out.print(num[j][i]);
			}
			System.out.println();
		}
	}

}
