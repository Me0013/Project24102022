package Inheritance;

public class Dog extends Pet{
	
	public Dog(String colour, int age) {
		super(colour, age);
	}

	public static void main(String args[]) {
		
		Dog gigi = new Dog("black", 5); 
		
		gigi.play();
		gigi.eat();
		
		
		System.out.println("My dog Gigi is " + gigi.age);
		System.out.println("My dog Gigi is " + gigi.colour);
		
	}
}
