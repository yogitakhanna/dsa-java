package Rec_practice;

public class NthTriangle {
	public static void main(String[] args) {
		int n = 4;
		System.out.println(NTriangle(n)+1);
	}
	
	public static int NTriangle(int n) {
		if(n==0) {
			return -1;
		}
		int sum = NTriangle(n-1);
		int ans = n + sum;
		return ans;
	}
}
