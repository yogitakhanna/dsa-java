package yogita;
import java.util.Scanner;
public class practice_4 {
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int num = scn.nextInt();
			int ans = 0, digit = 0;
			int count = 0;
			while(num > 0) {
				digit = num % 10;
				
				count++;
				while(count > 0) {
					System.out.println(digit);
					count--;
				num = num / 10;
				ans = ans * 10 + digit;
				
			}
			//System.out.println(count);
			
			}
		}
}
