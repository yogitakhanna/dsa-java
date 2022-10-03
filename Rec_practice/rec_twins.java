package Rec_practice;
import java.util.*;
public class rec_twins {
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		String str = scn.nextLine();
		String str = "AXAXA";
		twin(str,"");
		System.out.println(count);
	}
	static int count = 0;
	public static void twin(String str, String path) {
		if(str.isEmpty()) {
			return;
		}
		twin(str.substring(1), path);
		char ch = str.charAt(0);
		if(ch == str.charAt(0)) {
			count++;
		}
	}
}
