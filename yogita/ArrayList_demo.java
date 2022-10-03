package yogita;

import java.util.ArrayList;

public class ArrayList_demo {
	public static void main(String[] args) {
		int[] arr1 = { 5, 7, 10, 10, 20, 30, 30, 50, 60, 60, 80 };
		int[] arr2 = { 10, 10, 15, 20, 30, 30, 30, 60, 70, 80, 80, 90 };
		System.out.println(Intersection(arr1, arr2));

		int[] one = { 9, 8, 7, 5 };
		int[] two = { 9, 6, 7 };
		System.out.println(Add(one, two));
	}

	public static ArrayList<Integer> Intersection(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		ArrayList<Integer> AL = new ArrayList<Integer>();
		while (i < arr1.length && j < arr1.length) {
			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				AL.add(arr1[i]);
				i++;
				j++;
			}
		}
		return AL;
	}

	public static ArrayList<Integer> Add(int[] arr1, int[] arr2) {
		int idx1 = arr1.length - 1;
		int idx2 = arr2.length - 1;
		int carry = 0;
		ArrayList<Integer> AL = new ArrayList<Integer>();
		while (idx1 >= 0 || idx2 >= 0) {
			int sum = carry;
			if (idx1 >= 0) {
				sum = sum + arr1[idx1];
			} else if (idx2 >= 0) {
				sum = sum + arr2[idx2];
			}
			int digit = sum % 10;
			AL.add(0, digit);
			carry = sum / 10;
			idx1--;
			idx2--;
		}
		if (carry != 0) {
			AL.add(0, carry);
		}
		return AL;
	}
}
