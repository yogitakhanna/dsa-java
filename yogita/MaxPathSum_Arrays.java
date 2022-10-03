package yogita;

import java.util.Scanner;

public class MaxPathSum_Arrays {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scn.nextInt();
		}
		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = scn.nextInt();
		}
//		MaxPathSum(arr1, arr2);
		
	}
	

	public static void MaxPathSum(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				int sum1 = 0;
				int sum2 = 0;
				int temp = 0;
				if (arr1[i] < arr2[j]) {
					sum1 += arr1[i];
					i++;
				} 
				else if (arr2[j] < arr1[i]) {
					sum2 += arr2[j];
					j++;
				}
				else {
					if(sum1>sum2) {
						temp = sum1;
						System.out.print(temp);
					}
					else if(sum2>sum1) {
						temp = sum2;
						System.out.print(temp);
					}
					sum1 = 0; sum2 = 0;
					i++;
					j++;
				}
			}
		}
	}
}
