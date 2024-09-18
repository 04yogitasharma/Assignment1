package assignment_1;

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=4;
		for(int i=row;i>=1;i--) {
			for(int j=row;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
