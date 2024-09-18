package assignment_1;

public class fibbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=15;
		int first=0;
		int second=1;
		System.out.print(first +" "+second);
		for(int i=2;i<n;i++) {
			int temp=first+second;
			System.out.print(" "+temp);
			first=second;
			second=temp;
			
			
		}
	}

}
