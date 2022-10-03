package Rec_practice;

public class subset {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 5, 3 };
		int sum = 10;
		subset(arr,sum,"");
	}

	public static void subset(int[] arr, int sum, String path) {
		if(arr.length==0) {
			System.out.println(path);
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==sum) {
				subset(arr, sum, path+arr[i]);	
			}
		}
	}
}
