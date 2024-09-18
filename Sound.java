package assignment_1;

class Animal{
	
	public void makeSound() {
		System.out.println("Animal make sound");
	}
}

class Dog extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Dog bark!");
	}
}

class Cat extends Animal{
	@Override
	public void makeSound(){
		System.out.println("Cat Meows!");
	}
}


public class Sound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myDog=new Dog();
		Animal myCat=new Cat();
		
		myDog.makeSound();
		myCat.makeSound();
	}

}
