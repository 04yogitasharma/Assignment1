package assignment_1;

public class Car {

	private String brand;
	private String model;
	private double price;
	
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Car(String brand, String model, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void display() {
		System.out.println("Brand: "+brand+
				           " Model: "+model+
				           " Price: "+price);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car("Mahindra","XUV",2000000);
		Car car2=new Car("Maruti Suzuki","Swift",1000000);
		Car car3=new Car("Tata","Tigor",500000);
		car1.display();
		car2.display();
		car3.display();
	}

}
