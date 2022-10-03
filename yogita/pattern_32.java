package yogita;

public class pattern_32 {
	public static void main(String[] args) {
		int i = 1, n = 5, num = 1;
		while(i<=n) {
			int j = 1;

			int star = 0;
			while(j<=i) {
					if(j<n) {
						
						if(j%2==0) {
							System.out.print("* ");
						}
						else {
							System.out.print(num+" ");
						}
						star++;
					}
					else {
						if(j%2==0) {
							System.out.print("* ");
						}
						else {
							System.out.print(num+" ");
						}
						star--;
					}
					j++;
				}
			System.out.println();
			num++;
			i++;
		}
			
			i = 1;int star = 0;
			while(i<n) {
				int j = n;
				while(j>i) {
					if(j<n) {
						if(j%2==0) {
							System.out.print("* ");
						}
						else {
							System.out.print(num+" ");
						}
						star++;
					}
					else {
						if(j%2==0) {
							System.out.print("* ");
						}
						else {
							System.out.print(num+" ");
						}
						star--;
					}
					j--;
				}
				System.out.println();
				i++;
			}
			System.out.println();
			num++;
			i++;
		}
	}

