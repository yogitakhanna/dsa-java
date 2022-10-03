package Rec_practice;
public class climbStairs_combination {
	public static void main(String[] args) {
		int n = 4;  //size of the board
		int m = 2;  //number of faces of the dice... no. of recursive calls
		climb(0,n,2,"");
	}
	
	public static void climb(int curr, int n, int m, String path) {
		if(curr==n) {
			System.out.println(path);
			return;
		}
		if(curr>n) {
			return;
		}
		for(int i = 1; i <= m; i++) {
			climb(curr+i, n, i, path+i);
		}
	}
}
