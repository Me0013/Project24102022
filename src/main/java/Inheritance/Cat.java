package Inheritance;

public class Cat extends Pet {
	
	public Cat(String colour, int age) {
		super(colour, age);
	}

	public static void main(String args[]) {
		
		Cat maya = new Cat("multicolor", 3);
		
		maya.eat();
		maya.play();
		
	System.out.println("My cat Maya has the colour " + maya.colour);
	
	System.out.println("My cat Maya is " + maya.age);
		
		
	}
}
