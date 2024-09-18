package assignment_1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student("Yogita",16,"10th grade");
		Student student2=new Student("Sakshi",18,"12th grade");
		Student student3=new Student("Vikas",15,"9th grade");
		
		student1.display();
		student2.display();
		student3.display();
	}

}

class Student{
	private String name;
	private int age;
	private String grade;
	
	public Student(String name, int age, String grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public void display(){
		System.out.println(" Student_name = "+name+
				           ", Student_age = "+age+
				           ", Student_grade = "+grade);
	}
}
