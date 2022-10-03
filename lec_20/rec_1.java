package lec_20;
//       queen combination wrt seats
public class rec_1 {
	public static void main(String[] args) {
//		queen_1D(3,0,2,"");
		queen_2D(2,2,0,0,2,"");
//		queen_2D_isSafe(3, 3, 0, 0, 2,"", new boolean[3][3]);
	}
	public static void queen_1D(int total_col, int c, int Q_tp, String path) {
		if(Q_tp==0) {
			System.out.println(path);
			return;
		}
		if(c==total_col) {        
//			System.out.println(path);
			return;
		}
		queen_1D( total_col, c+1, Q_tp-1, path+"{"+c+"}"); // B
		queen_1D( total_col, c+1, Q_tp, path); // NB
	}
	
	public static void queen_2D(int total_row, int total_col, int r, int c, int Q_tp, String path) {
		if(Q_tp==0) {
			System.out.println(path);
			return;
		}
		if(c==total_col) {
			c=0;
			r=r+1;
		}
		if(r==total_row) { // -ve BaseCase
			return;
		}
		queen_2D(total_row, total_col, r, c+1, Q_tp-1, path+"{"+r+","+c+"}"); // B
		queen_2D(total_row, total_col, r, c+1, Q_tp, path); // NB
	}
	
	public static void queen_2D_isSafe(int total_row, int total_col, int r, int c, int Q_tp, String path,boolean[][] board) {
		if(Q_tp==0) {
			System.out.println(path);
			print2D(board);
			return;
		}
		if(c==total_col) {
			c=0;
			r=r+1;
		}
		if(r==total_row) { // -ve BaseCase
			return;
		}
		if(isSafe(r, c, board)) {
			board[r][c]= true;
			queen_2D_isSafe(total_row, total_col, r, c+1, Q_tp-1, path+"{"+r+","+c+"}", board ); // B
			board[r][c]=false;
		}
		queen_2D_isSafe(total_row, total_col, r, c+1, Q_tp, path, board); // NB
	}
	
	public static boolean isSafe(int r, int c, boolean[][] board) {
//		TODO Auto-generated method stub
		for(int R = 0; R < r; R++) {
			if(board[r][c]) {
				return false;
			}
		}
		for(int C = 0; C < c; C++) {
			if(board[r][c]) {
				return false;
			}
		}
		int R = r;
		int C = c;
		while(R>=0 && C<board[0].length) {
			if(board[R][C]) {
				return false;
			}
			R--;C++;
		}
		return true;
	}
	
	public static void print2D(boolean[][] board) {
		for(boolean[] row : board) {
			for(boolean t : row) {
				System.out.print(t + " ");
			}
			System.out.println();
		}
		System.out.println("=======================================");
	}
	
}


