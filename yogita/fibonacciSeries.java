package yogita;

public class fibonacciSeries {
	public static void main(String[] args) {
		int a=0,b=1,n=0,count=0;
		while(count<n) {
			int c=a+b;
//			System.out.println(a);
			a=b;
			b=c;
			count++;
		}
		System.out.println(a);
	}
}
