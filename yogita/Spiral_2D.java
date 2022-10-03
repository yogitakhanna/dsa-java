package yogita;

public class Spiral_2D {
	public static void main(String[] args) {
		int[][] mat = { { 11, 12, 13, 14 } };
		int minr = 0;    //min row
		int maxr = mat.length - 1;    //max row
		int minc = 0;      //min col
		int maxc = mat[0].length - 1;    //max col
		int count = 0;
		int product = mat.length * mat[0].length;
		
		while(minr <= maxr && minc <= maxc) {
			for(int r = minr; r <= maxr && product >count; r++) {
				System.out.print(mat[r][minc] + " ");
				count++;
			}
			
			System.out.println();
			for(int c = minc + 1; c <= maxc && product > count; c++) {
				System.out.print(mat[maxr][c] + " ");
				count++;
			}
			
			System.out.println();
			for(int r = maxr - 1; r >= minr && product > count; r--) {
				System.out.print(mat[r][maxc] + " ");
				count++;
			}
			
			System.out.println();
			for(int c = maxc - 1; c >= minc + 1 && product > count; c--) {
				System.out.print(mat[minr][c] + " ");
				count++;
			}
			System.out.println();
			minr++;
			minc++;
			maxr--;
			maxc--;
			System.out.println("===========================");
		}
	}
}
