package assignment_1;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=3;
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=(i-1);j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
