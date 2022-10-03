package Rec_practice;

public class queen_perm {
	public static void main(String[] args) {
		int n = 4;
		queenPerm(n,n,1,1,n,0," ");
	}
	public static void queenPerm(int total_r, int total_c, int r, int c, int n, int prev, String path){
		if(n==0) {
			System.out.println(path);
			return;
		}
		if(c==total_c+1) {
			r=r+1;
			c=1;
		}
		if(r==total_r+1 || c==total_c+1) {
//			System.out.println(path);
			return;
		}
	
		if(r == total_r+1 && c == total_c+1) {
			return;
		}
		if(n>total_c+1) {
			return;
		}
		for(int i = prev; i < total_c; i++) {
			queenPerm(total_r, total_c, r, c+1, n-1, prev + i, path+"{"+r+"-"+c+"}");
		}
	}
}
