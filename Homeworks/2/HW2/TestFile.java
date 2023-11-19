import java.util.*;
class matrix {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		int num[][] = new int[3][3];
		for (int i=0;i<num.length;i++) {
			for (int j=0;j<num.length;j++) {
				num[i][j]=sc.nextInt();
			}
		}

		for (int i=0;i<num.length;i++) {
			for (int j=0;j<num.length;j++) {
				System.out.print (num[i][j]+" ");
			}
			System.out.println();
		}
	}
}