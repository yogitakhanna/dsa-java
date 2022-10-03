package Rec_practice;
import java.util.*;
public class duplicateCharacterFormatting {
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		String str = scn.nextLine();
		System.out.println(duplicateChar("hello"));
	}
	
	public static String duplicateChar(String str) {
		if(str.length()==1) {
			return str;
		}
		String ch = duplicateChar(str.substring(1));
		if(str.charAt(0)==ch.charAt(0)) {
			return str.charAt(0)+"*"+ch;
		}
		return str.charAt(0)+ch;
	}
}
