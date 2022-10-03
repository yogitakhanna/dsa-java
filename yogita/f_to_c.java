package yogita;
import java.util.Scanner;
public class f_to_c {
	public static void main(String[] args) {

		 Scanner scn = new Scanner(System.in);
	        int Min = scn.nextInt();
	        int Max = scn.nextInt();
	        int Step = scn.nextInt();
	        while(Min<=Max) {
	        		int  c = 0;
	        		c = (Min - 32)*5/9;
	        		System.out.print(Min+" : ");
	        		System.out.println(c+" ");
	        		
	        	
	        	Min= Min + Step;
	        }
	
	}
}
