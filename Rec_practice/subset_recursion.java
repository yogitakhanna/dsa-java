package Rec_practice;

import java.lang.reflect.Array;

public class subset_recursion {
	public static void main(String[] args) {
		int n = 5;
//		int[] arr = {1, 4, 6, 5, 3};
		int[] arr = {3,5,6,4,1};
		int s = 10;
//		int[] arr1 = reverse(arr,0);
		climb(arr,s,0,"");
	}
    public static void climb(int[] arr, int s, int i, String path) {
		if(s==0) {
            // Collection.sort(path);
			System.out.println(path);
			return;
		}
		if(s<0) {
			return;
		}
		if(i>=arr.length) {
			return;
		}	
		climb(arr, s, 1+i, path);
		climb(arr, s-arr[i], 1+i, path+arr[i]+" ");
	}
//	public static void reverse(String str , String path) {
//		if(str.isEmpty()) {
//			return;
//		}
//		char ch = str.charAt(0);
//		reverse(str.substring(1), path+ch);
//		System.out.print(path);
//	}
	
	
	public static void Reverse(int[] arr, int s) {
		if(s == arr.length) {
			return;
		}
		Reverse(arr, s+1);
		System.out.println(arr[s]);
	}
	
}
