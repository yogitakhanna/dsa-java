package lec_18;
//      Generate paranthesis
public class rec_3 {
	public static void main(String[] args) {
		Gen(2, 2, "");
	}
	
	public static void Gen(int op, int cl, String path) {
		if(op>cl) {
			return;
		}
		if(0 == cl && op == 0) {
			System.out.println(path);
		}
		if(op > 0) {
			Gen(op - 1, cl, path + "(");
		}
		if(cl > 0) {
			Gen(op, cl - 1, path + ")");
		}
	}
}
