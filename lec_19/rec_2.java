package lec_19;

public class rec_2 {
	public static void main(String[] args) {
		MazePath(0,0,2,2,"");
	}
	public static void MazePath(int row, int col, int dest_r, int dest_c, String path) {
		if(row == dest_r && col == dest_c) {
			System.out.println(path);
			return;
		}
		if(row>dest_r || col> dest_c) {
//			System.out.println(path);
			return;
		}
		MazePath(row+1, col, dest_r, dest_c, path+"D");
		MazePath(row, col+1, dest_r, dest_c, path+"R");
	}
}
