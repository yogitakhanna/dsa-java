package Rec_practice;
import java.util.*;
public class allSubsequence {
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		int n = scn.nextInt();
//		String str = scn.nextLine();
		String str = "ab";
		String path = "";
		for(int i = 61; i<79; i++) {
			char c=(char)i;
			subSeq(str, path);
		}
	}
	
	public static void subSeq(String str, String path) {
		if(str.isEmpty()) {
			System.out.print(path+" ");
			return;
		}
		
		char ch = str.charAt(0);
		for(char j = 61; j <= 79; j++) {
			char c=(char)j;
			subSeq(str.substring(1) , path + ch);
			subSeq(str.substring(1) , path);
		}
	}
}
