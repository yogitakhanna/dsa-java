package Rec_practice;

public class keypadCodes_LKC {
	public static void main(String[] args) {
		LKC("12", "");
	}
	
	public static String options( char ch) {
		if(ch == '1') {
			return "abc";
		}
		else if(ch == '2') {
			return "def";
		}
		else if(ch == '3') {
			return "def";
		}
		else if(ch == '4') {
			return "def";
		}
		else if(ch == '5') {
			return "def";
		}
		else if(ch == '6') {
			return "def";
		}
		else if(ch == '7') {
			return "def";
		}
		else if(ch == '8') {
			return "def";
		}
		else if(ch == '9') {
			return "def";
		}
		else {
			return "";
		} 
	}
	
	public static void LKC(String digits , String path) {
		if(digits.isEmpty()) {
			System.out.println(path);
			return;
		}
		
		char ch = digits.charAt(0);
		String ops = options(ch);
		for(int i = 0; i < ops.length(); i++) {
			LKC(digits.substring(1), path+ops.charAt(i));
		}
	}
}
