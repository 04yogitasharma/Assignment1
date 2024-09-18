package assignment_1;

class Employee1 {
	
	private String name;
	private int id;
	private double salary;
	
	public Employee1(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Name: "+name+
				           ", ID: "+id+
				           ", Salary: "+salary);
	}
	
	
}

class Manager extends Employee1{
	private double bonus;

	public Manager(String name, int id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}
	
	public void display() {
		super.display();
		System.out.println(" Bonus: "+bonus);
		System.out.println();
	}
	
}
	
	public class Employee{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 ed=new Employee1("Akash", 101, 30000);
		ed.display();
		System.out.println("............................................");
		Manager md=new Manager("Vikas",100,80000,5000);
		md.display();
	}

}
