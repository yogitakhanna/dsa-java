package Rec_practice;
public class boardPath {
	public static void main(String[] args) {
		int n = 3;  //size of the board
		int m = 3;  //number of faces of the dice... no. of recursive calls
		board(0,n,m,"");
	}
	
	public static void board(int curr, int n, int m, String path) {
		if(curr==n) {
			System.out.println(path);
			return;
		}
		if(curr>n) {
			return;
		}
		for(int i = 1; i <= m; i++) {
			board(curr+i, n, m, path+i);
		}
	}
}
