package assignment_1;

abstract class Shape{
	public abstract double area(); 
	
}
class Circle extends Shape{
	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
}

class Rectangle1 extends Shape{
	private double length ;
	private double width;
	public Rectangle1(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return length*width;
	}
}
class Square extends Shape{
	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}
	
	public double area() {
		return side*side;
	}
}




public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle=new Circle(5);
		Shape rectangle=new Rectangle1(3,4);
		Shape square=new Square(5);
		
		System.out.println("Area of circle: "+circle.area());
		System.out.println("Area of rectangle: "+rectangle.area());
		System.out.println("Area of square: "+square.area());
	}

}
