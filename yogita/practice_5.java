package yogita;

import java.util.Scanner;

public class practice_5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
//		MinimumSwaps(arr);
		MajorityElement(arr);
	}

	public static void MajorityElement(int[] arr) {
		int count = 0;
		int var = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < j; i++) {
				if (arr[i] == arr[j]) {
					count++;
					var = arr[i];
				}
			}
		}
		System.out.println(var);
	}

	public static void MinimumSwaps(int[] arr) {
		int count = 1;
		for (int last = 1; last < arr.length; last++) {
			int ali = arr[last];
			int idx = last - 1;
			while (idx >= 0 && arr[idx] > ali) {
				arr[idx + 1] = arr[idx];
				idx--;
//				if() {
//					break;
//				}
			}
			arr[idx + 1] = ali;
//			System.out.println(count);
			count++;
		}
		System.out.println(count++);
	}

	// Product Of Array Except Self
//
//	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < arr.length - 1; i++) {
//			arr[i] = scn.nextInt();
//		}
//		ProductOfArray(arr);
//	}

//	public static void ProductOfArray(int[] arr) {
//		for (int j = 0; j <= arr.length - 1; j++) {
//			for (int i = 0; i <= arr.length - 1; i++) {
//				int product = 1;
//					if (arr[i] > 1 && arr[j] > 1) {
//						product = product *( arr[i] * arr[j]);
//						System.out.print(product + " ");
//					}
//			}
//
//		}
//	}
}
