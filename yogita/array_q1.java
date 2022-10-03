package yogita;

public class array_q1 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50}
		int n = 20;
		ToCheck(arr);
	}
	public static void ToCheck(int[]arr) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println(arr[i]);
			}
		}
	}
}
