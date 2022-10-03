package Rec_practice;

public class countStringToInteger {
	public static void main(String[] args) {
		stringToInt("1234", "");
	}
		public static void stringToInt(String digits, String path) {
		if (digits.isEmpty()) {
			System.out.println(path);
			return;
		}
		char ch = digits.charAt(0); 
		String ops = Options(ch); 
		stringToInt(digits.substring(1), path + ops.charAt(0));
	}

	
	public static String Options(char ch) {
		if (ch == '2') {
			return "2";
		} else if (ch == '3') {
			return "3";
		} else if (ch == '4') {
			return "4";
		} else if (ch == '5') {
			return "5";
		} else if (ch == '6') {
			return "6";
		} else if (ch == '7') {
			return "7";
		} else if (ch == '8') {
			return "8";
		} else if (ch == '9') {
			return "9";
		} else if (ch == '0') {
			return "0";
		} else if (ch == '1') {
			return "1";
		}else {
			return "";
		}
	}
}
