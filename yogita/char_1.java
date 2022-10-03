package yogita;
import java.util.Scanner;
public class char_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		if(ch>='A' && ch<='Z') {
			System.out.println("Upper");
			
		}
		else if( ch>='a' && ch<='z') {
			System.out.println("Lower");
		}
	}
}
