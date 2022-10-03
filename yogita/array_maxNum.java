package yogita;

public class array_maxNum {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		MaxNum(arr);
	}
	public static int MaxNum(int[]arr) {
		int max = arr[0];
		
		for(int val : arr) {
			
			if(val>max) {
				max = val;
			}
		}
		return max;
	}
}
