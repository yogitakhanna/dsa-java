package Rec_practice;

public class MazePath_D2 {
	public static void main(String[] args) {
		maze(0,0,5,5,"");
	}
	public static void maze(int r, int c, int dest_r, int dest_c, String path) {
		if(r==dest_r-1 && c== dest_c-1) {
			System.out.println(path);
			return;
		}
		if(r>=dest_r || c>=dest_c) {
			return;
		}
		
		
		maze(r+1, c, dest_r, dest_c, path+"H");
		maze(r, c+1, dest_r, dest_c, path+"V");
		maze(r+1, c+1, dest_r, dest_c, path+"D");
	}
}
