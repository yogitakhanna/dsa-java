package yogita;

public class Palindrome_string {
	public static void main(String[] args) {
		String str = "aaaaaaaaa";
//		for(int s = 0; s < str.length(); s++) {
//			for(int e = s + 1; e <= str.length(); e++) {
//				String part = str.substring(s, e);
//				if(isPalin(part)) {
//					System.out.println(part);
//				}
//			}
//		}
//		printPalindrome_string(str);
		WordRev("the sky is blue");
	}
	
	public static boolean isPalin(String str) {
		int s =  0;
		int e = str.length() - 1;
		while(s < e) {
			if(str.charAt(s) == str.charAt(e)) {
				s++;e--;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	// optimising palindrome
	
	public static void Palindrome_string(String str) {
		for(int c = 0; c < str.length(); c++) {
			for(int r = 0; c - r >= 0 && c + r < str.length(); r++) {
				int Linx = c - r; //Linx = left index
				int Rinx = c + r; //Rinx = right index
				if(str.charAt(Linx) == str.charAt(Rinx)) {
					System.out.println(str.substring(Linx, Rinx + 1));
				}
				else {
					break;
				}
			}
		}
		for(double c = 0.5; c < str.length(); c++) {
			for(double r = 0.5; c - r >= 0 && c + r < str.length(); r++) {
				int Linx = (int) (c - r);
				int Rinx = (int) (c + r);
				if(str.charAt(Linx) == str.charAt(Rinx)){
					System.out.println(str.substring(Linx, Rinx + 1));
				}
			}
		}
	}
	
	public static void WordRev(String str) {
		while(true) {
			int idx = str.lastIndexOf(" ");
			String word = str.substring(idx + 1);
			System.out.println(word);
			if(idx == -1) {
				break;
			}
			str = str.substring(0, idx);
		}
	}
}
