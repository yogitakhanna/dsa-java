package yogita;

public class String_1 {
	public static void main(String[] args) {
		String str = "ABCDEBC";
		System.out.println(str.charAt(0));
		
		System.out.println(str.charAt(str.length()-1));
		System.out.println(str.indexOf("cd"));
		System.out.println(str.lastIndexOf("EBC"));
		
		System.out.println(str.startsWith("ABB"));
		System.out.println(str.endsWith("BC"));
		
		for(int s = 0; s < str.length(); s++) {
			for(int e = s+1; e <= str.length(); e++) {
				String part = str.substring(s, e);
				System.out.println(part);
			}
		}
		System.out.println(isPalin("ABCDEF"));
	}

	public static boolean isPalin(String str) {
		int s = 0, e = str.length()-1;
			while(s<e) {
				
				if(str.charAt(s)==str.charAt(e)) {
					s++;
					e--;
				}
				else {
					return false;
				}
			}
			return true;
	}
}
