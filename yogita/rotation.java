package yogita;

public class rotation {
	public static void main(String[] args) {
		int num=12345;
		int rot = 3;
//		int copy = num;
//		int nod = 0;
//		while(num>0) {
//			num = num/10;
//			nod++;
//		}
//		num = copy;
//		rot = rot % nod;
//		for(int r =1; r<=rot;r++) {
//			int digit = num%10;
//			int remain = num/10;
//			int mult = (int)Math.pow(10, nod-1);
//			num = mult * digit + remain;
//			System.out.println(num);
//		}
		int nod = 0;
		while(num>0) {
			num = num/10;
			nod++;
		}
		num = copy;
		int div = (int)Math.pow(10, rot);
		int p1 = num/div;
		int p2 = num%div;
		int mult = (int)Math.pow(10, nod - rot);
		System.out.println(p2*mult+p1);
	}
}
