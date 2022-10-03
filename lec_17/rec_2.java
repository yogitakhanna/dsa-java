package lec_17;

import java.util.Arrays;

public class rec_2 {
	public static void main(String[] args) {
		int[] arr = {10, 200, 40, -50, 10, 10, 10};
		int ali = 10;
//		Print(arr,0);
//		Reverse(arr,0);
//		System.out.println(Max(arr,0));
//		System.out.println(Min(arr,0));
//		System.out.println(FO(arr,0,10));
//		System.out.println(LO(arr,0,10));
		int count = 0;
		System.out.println(Arrays.toString(AllOcc(arr,0,10,0)));
	}
	
	public static void Print(int[] arr, int s) {
		if(s == arr.length) {
			return;
		}
//		BP : Print(arr,s)
//		SP : Print(arr,s+1)
		System.out.println(arr[s]);
		Print(arr, s + 1);
	}
	
	public static void Reverse(int[] arr, int s) {
		if(s == arr.length) {
			return;
		}
		Reverse(arr, s+1);
		System.out.println(arr[s]);
	}
	
	public static int Max(int[] arr, int s) {
		if(s == arr.length) {
			return Integer.MIN_VALUE;
		}
//		BP : Max(arr,s)
//		SP : Max(arr,s+1)
		
		int sp = Max(arr, s + 1);
		return Math.max(arr[s], sp);
		
	}
	
	public static int Min(int[] arr, int s) {
		if(s == arr.length) {
			return Integer.MAX_VALUE;
		}
//		BP : Max(arr,s)
//		SP : Max(arr,s+1)
		
		int sp = Min(arr, s + 1);
		return Math.min(arr[s], sp);
		
	}
	public static int FO(int[] arr, int s, int ali) {
		if(s == arr.length) {
			return -1;
		}
//		BP : FO(arr,s,ali)
//		SP : FO(arr,s+1,ali)
		
		int sp = FO(arr, s + 1, ali);
		if(arr[s] == ali) {
			return s;
		}
		else {
			return sp;
		}
	}
	
	public static int LO(int[] arr, int s, int ali) {
		if(s == arr.length) {
			return -1;
		}
//		BP : LO(arr, s, ali)
//		SP : LO(arr, s + 1, ali)
		
		int sp = LO(arr, s + 1, ali);
		if(sp == -1 && arr[s] == ali) {
			return s;
		}
		else {
			return sp;
		}
	}
	
	public static int[] AllOcc(int[] arr, int s, int ali, int count) {
		if(s == arr.length) {
			return new int[count];
		}
		if(arr[s] == ali) {
			int[] sp = AllOcc(arr, s+1, ali, count+1);
			sp[count] = s;
			return sp;
		}
		else {
			int[] sp = AllOcc(arr, s+1, ali, count);
			return sp;
		}
	}
}


