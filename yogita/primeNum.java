package yogita;

public class primeNum {
	public static void main(String[] args) {
		int nums=3;
		int i=1;
		int factors=0;
		while(i<=nums) {
			if(nums%i==0) {
				factors=factors+1;
				System.out.println(i);
			}
			i++;
		}
//		if(factors==2) {
//			System.out.println("prime");
//		}
//		else {
//			System.out.println("not prime");
//		}
	}
}
