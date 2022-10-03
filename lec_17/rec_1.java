package lec_17;
//			coin toss
public class rec_1 {
	public static void main(String[] args) {
		CT(3,"");
	}
	
	public static void CT(int n, String path) {
		if(n==0) {
			System.out.println(path);
			return;
		}
//		BP(n,"")
		CT(n - 1, path + "H");
		CT(n - 1, path + "T");
		
	}
}
