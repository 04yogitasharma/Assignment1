package assignment_1;

public class Area_Perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1=new Rectangle(5,4);
		Rectangle rectangle2=new Rectangle(4,4);
		Rectangle rectangle3=new Rectangle(3,4);
		
		rectangle1.Area();
		rectangle1.perimeter();
		rectangle1.display();
		
		rectangle2.Area();
		rectangle2.perimeter();
		rectangle2.display();
		
		rectangle3.Area();
		rectangle3.perimeter();
		rectangle3.display();
	}

}

class Rectangle{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double Area() {
		return length*width;
	}
	
	public double perimeter() {
		return 2*(length+width);
	}
	
	public void display() {
		System.out.println("Length: "+length+
				           " Width: "+width+
				           " Area: "+Area()+
				           " Perimeter: "+perimeter());
	}
}
