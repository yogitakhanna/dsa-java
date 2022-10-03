package lec_16;

public class rec_7 {
	public static void main(String[] args) {
		int x = 2;
		int a = 10;
		System.out.println(Power(x, a));
	}

	public static int Power(int x, int a) {
		if (a == 0) {
			return 1;
		}
		int pow = Power(x, a - 1);
		return x * pow;
	}
}
