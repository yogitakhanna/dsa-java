package Rec_practice;

public class first_index {
	public static void main(String[] args) {
		int n = 5;
		int arr[] = {3,2,1,2,2};
		int target = 2;
		System.out.println(first(arr, 0, target));
	}
	public static int first(int arr[], int s, int target) {
		if(s==arr.length) {
			return -1;
		}
		
		int sp = first(arr,s+1,target);
		if(arr[s]==target) {
			return s;
		}
		else {
			return sp;
		}
	}
	
}
