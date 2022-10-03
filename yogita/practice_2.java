package yogita;

import java.util.Scanner;
//Boston number
public class practice_2 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
		int i=1;
		int ans = 0, sum = 0;
		int factors=0;
		while(i<=num) {
			if(num%i==0) {
				//System.out.println(i);
				sum = sum + i;
			}
			i++;
		}
       
		while(num>0) {
			int digit=num%10;
			//System.out.println(digit);
			num=num/10;
			ans = ans  + digit;
			
		}
		//System.out.println(ans);
	    
		if(sum == ans) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
}
