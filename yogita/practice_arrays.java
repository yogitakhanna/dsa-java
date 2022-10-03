package yogita;
import java.util.Scanner;
public class practice_arrays {
//	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		int[]arr = new int[n];
//		for(int i = 0; i < arr.length;i++) {
//				arr[i] = scn.nextInt();
//		}
//		ProductExceptSelf(arr,n);
//	}
	public static void ProductExceptSelf(int[]arr , int n) {
		int[]res = new int[n];
		arr[0] = 1;
		int multi = 1;
		for(int i = 1; i<n; i++) {
			res[i] = res[i-1]*arr[i-1];
		}
		for(int i = res.length-1; i>=0; i--) {
			res[i] = res[i]*multi;
			multi = res[i]*multi;
		}
		for(int i=0; i<n; i++) {
			System.out.println(res[i]+" ");
		}
	}
	  public static void main(String args[]) {
	        Scanner scn = new Scanner(System.in);
	        String str = scn.nextLine();

	        MajorityElement(str);
	    }
    public static void MajorityElement(String str) {
		int var = 0;
		for (int j = 0; j < str.length(); j++) {
			int count = 0;
			for (int i = 0; i < j; i++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
					var = str.charAt(i);
				}
			}
		}
		System.out.println(var);
	}
}
