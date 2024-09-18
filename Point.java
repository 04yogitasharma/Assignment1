package assignment_1;

public class Point {

	private int x;
	private int y;
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public Point(Point p) {
		this.x=p.x;
		this.y=p.y;
	}
	
	public void display() {
		System.out.println("x: "+x+
				           ", y: "+y);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point(15,25);
		p1.display();
		Point p2=new Point(p1);
		p2.display();

	}

}
