package lec_19;

public class rec_3 {
	public static void main(String[] args) {
		PalinPart("nitin","");
	}
	public static void PalinPart(String table, String bag) {
		if(table.isEmpty()) {
			System.out.println(bag);
		}
		for(int i = 1; i<=table.length(); i++) {
			String part = table.substring(0,i);
			String remain = table.substring(i);
			if(isPalin(part)) {
				PalinPart(remain, bag+"-"+part);
			}
		}
	}
	
	public static boolean isPalin(String part) {
		int s = 0; int e = part.length()-1;
		while(s<e) {
			if(part.charAt(s)!=part.charAt(e)) {
				return false;
			}
			s++;e--;
		}
		return true;
	}
}
