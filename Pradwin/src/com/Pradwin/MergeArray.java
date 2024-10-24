package com.Pradwin;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] F = {1,3,5,7};
		int[] S = {2,4,6,8};
		
		int[] merged = new int[F.length+S.length];
		
		int i=0,j=0,k=0;
		
		while(i < F.length && j < S.length) {
			if (F[i] < S[j]) {
				merged[k++] = F[i++];
			}
			else {
				merged[k++] = S[j++];
			}
		}
		while(i < F.length) {
			merged[k++] = F[i++];
		}
		while(j < S.length) {
			merged[k++] = S[j++];
		}
		
		for(int num : merged) {
			System.out.println(num);
		}
	}

}
