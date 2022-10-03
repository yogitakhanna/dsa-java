package yogita;

import java.util.Scanner;

public class array_input {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}
		disp(arr);
		max(arr);
	}

	public static void disp(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int val : arr) {
			if (val > max) {
				max = val;
			}
		}
		return max;
	}
}
