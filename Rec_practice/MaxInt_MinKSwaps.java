package Rec_practice;

import java.util.Arrays;

public class MaxInt_MinKSwaps {
	public static void main(String[] args) {
		int n = 2541;
		int k = 1;
		int count = 0;
		while( n > 0 ) {
			int temp = n%10;
			count++;
			n = n/10;	 
		}
		int[] arr = new int[count];
		while( n > 0) {
			int temp = n%10;
			arr[temp] = count;
			System.out.println(Arrays.toString(arr));
			n = n/10;
		}
//		MinK(n,n,k);
	}
	public static void reverse(int[] arr) {
		
		reverse()
	}
	public static void MinK(int n, int d, int k) {
		
//		MinK(n,d+1,k);
	}
}
