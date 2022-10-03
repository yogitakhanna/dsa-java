package yogita;


	import java.util.Scanner;
	public class practice_1 {
	    public static void main(String args[]) {
	        Scanner scn = new Scanner(System.in);
	        int num = scn.nextInt();
			int ans=0;
	        while(num>0) {
			    int digit=num%10;
			    num=num/10;
			    ans = ans * 10 + digit;	
	        }
	        int count = 0;
	        while(ans>0){
	            int ans1 = 0;	
			    int t = ans % 10;
			    if( t > 0 || t < 0) {
				ans1 = t;
				System.out.print(ans1);
			    }
			    else if( count < 0) {
			    	System.out.println("-");
			    	System.out.println(ans1);
			    }
	            else{
	                t = 5;
	                System.out.print(t);
	            }
			    ans = ans / 10;
			    count ++;
	        }
	    }
	}
	

