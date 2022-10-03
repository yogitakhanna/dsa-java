package lec_19;

public class rec_1 {
	public static void main(String[] args) {
		ClimbingStairs(0,3,"");
	}
	public static void ClimbingStairs(int current , int dest, String path) {
		if(current==dest) {
			System.out.println(path);
			return;
		}
		if(current>dest) {
			return;
		}
		ClimbingStairs(current+1, dest, path+1);
		ClimbingStairs(current+2, dest, path+2);
		ClimbingStairs(current+3, dest, path+3);
		
	}
}
