package yogita;

public class reverseDigits {
	public static void main(String[] args) {
		int num=5238;
		int ans=0;
		while(num>0) {
			int digit=num%10;
			System.out.println(digit);
			num=num/10;
			ans = ans * 10 + digit;
			
		}
		System.out.println(ans);
	}

}
