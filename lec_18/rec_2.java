package lec_18;

import java.util.ArrayList;
import java.util.List;

public class rec_2 {
	public static void main(String[] args) {
		LKC("632","");
	}

	// without List or ArrayList

	public static void LKC(String digits, String path) {
		if (digits.isEmpty()) {
			System.out.println(path);
			return;
		}
		// 632 , // _
		char ch = digits.charAt(0); // 6
		String ops = Options(ch); // mno
		for (int i = 0; i < ops.length(); i++) {
			LKC(digits.substring(1), path + ops.charAt(i));
		}
	}

	public static String Options(char ch) {
		if (ch == '2') {
			return "abc";
		} else if (ch == '3') {
			return "def";
		} else if (ch == '4') {
			return "ghi";
		} else if (ch == '5') {
			return "jkl";
		} else if (ch == '6') {
			return "mno";
		} else if (ch == '7') {
			return "pqrs";
		} else if (ch == '8') {
			return "tuv";
		} else if (ch == '9') {
			return "wxyz";
		} else {
			return "";
		}
	}

	
	
	// with List or ArrayList
	
	
//	public List<String> letterCombinations(String digits){
//		List<String> AL = new ArrayList<String>();
//		LKC(digits, "", AL);
//		return AL;
//	}
	
//	public static void LKC(String digits, String path, List<String> AL) {
//		if(digits.isEmpty()) {
////			System.out.println(path);
//			if(!path.isEmpty()) {
//				AL.add(path);
//			}
//			return;
//		}
//		// 632 ,//_
//		char ch = digits.charAt(0); // 6
//		String ops = Options(ch); //  mno
//		for(int i = 0; i < ops.length(); i++) {
//			LKC(digits.substring(1), path + ops.charAt(i), AL);
//		}
//	}
	
//	public static String Options(char ch) {
//		if (ch == '2') {
//			return "abc";
//		} else if (ch == '3') {
//			return "def";
//		} else if (ch == '4') {
//			return "ghi";
//		} else if (ch == '5') {
//			return "jkl";
//		} else if (ch == '6') {
//			return "mno";
//		} else if (ch == '7') {
//			return "pqrs";
//		} else if (ch == '8') {
//			return "tuv";
//		} else if (ch == '9') {
//			return "wxyz";
//		} else {
//			return "";
//		}
//	}
	

}
