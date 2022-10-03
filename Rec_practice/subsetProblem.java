package Rec_practice;

public class subsetProblem {
	public static void main(String[] args) {
		int n = 9;
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int s = 15;
		climb(0,arr,n,s,0,"");
		System.out.println();
		System.out.println(count);
	}
	static int count = 0;
	public static void climb(int curr,int[] arr, int n, int s, int prev, String path) {
		if(curr==s) {
			System.out.print(path+" ");
			count++;
			return;
		}
		if(curr>arr.length) {
			return;
		}
		
		for(int i = prev; i < arr.length; i++) {
			climb(curr+arr[i], arr, n, s,1+i, path+arr[i]+" ");
		}
	}
}
