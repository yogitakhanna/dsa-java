package yogita;

import java.util.Scanner;

public class array_reverse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}
		RevPrint(arr);
	}

	public static void RevPrint(int[] arr) {
			int l = 0;
			int r = arr.length - 1;
			while (l < r) {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}
			for (int ali : arr) {
				System.out.println(ali);
			}
		System.out.println();
	}
}
