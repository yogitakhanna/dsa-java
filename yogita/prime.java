
package yogita;

public class prime {
	public static void main(String[] args) {
		int n = 255;
		int i=2;
		int flag=0;
		while(i<n){
			if(n%i==0) {
				flag=1;
			}
			i++;
		}
		
		if(flag==1) {
			System.out.print("Not Prime");
		}
		else {
			System.out.print("Prime");
		}
	}
}



//package yogita;
//
//public class prime {
//	public static void main(String[] args) {
//		int num=12;
//		int div=1;
//		int factor=0;
//		while(div<=num) {
//			int rem;
//			rem=num%div;
//			if(rem==0) {
//				System.out.println(div);
//
//			}
//			div++;
//		}
//		System.out.println(factor);
//		if(factor==2) {
//			System.out.println("not prime");
//		}
//		if(factor!=0) {
//			System.out.println("prime");
//		}
//	}
//}
