package Rec_practice;

public class lexicalOrder {
	public static void main(String[] args) {
//		System.out.println("0");
//		for(int num = 1; num <= 9; num++) {
//			lexical(num,1000);
//		}
		
		for(int i = 1; i <= 9; i++) {
			jumpin(i,105);
		}
	}
	public static void lexical(int curr, int limit) {
		if(curr>limit) {
			return;
		}
		System.out.println(curr);
		int digit = 0;
		for(; digit <= 9; digit++) {
			lexical(curr*10+digit, limit);
		}
	}
	
	public static void jumpin(int curr, int limit) {
		if(curr > limit) {
			return;
		}
		System.out.println(curr);
		int digit = curr % 10;
		if(digit < 9) {
			jumpin(curr * 10 + digit + 1, limit);
		}
		if(digit > 0) {
			jumpin(curr * 10 + digit - 1, limit);
		}
	}
//	A number is called a jumping number if all adjacent digits in it differ by 1.
//	The difference between 9 and 0 is not 1.
//	7, 8987, 4343456 = correct ; 796 and 89098 = wrong
	
//	print all jumping numbers <= x input.
//	numbers ordered w.r.t. MSB
//	x = 105
//	0
//	1 10 101 12
//	2 21 23
//	3 32 34
//	4 43 45
//	5 54 56
	
	
	
}
