package yogita;
import java.util.Scanner;
public class FtoC {
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
	        int Min = scn.nextInt();
	        int Max = scn.nextInt();
	        int Step = scn.nextInt();
	        while(Min<=Max) {
	        	int step = 1;
	        	while(Min<=Step) {
	        		int f = 0, c;
	        		c = (f - 32)*5/9;
	        		System.out.println(c+" ");
	        		step++;
	        	}
	        	
	        	Min++;
	        }
	}
}
