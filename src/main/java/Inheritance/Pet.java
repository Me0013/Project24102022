package Inheritance;

public class Pet {
		String colour;
		int age; 
		
		
		//the Pet class has one constructor
		public Pet(String colour, int age) {
			this.colour = colour;
			this.age = age; 
		}
		
		public void eat() {
			System.out.println("I am eating.");
		}
		
		public void play() {
			System.out.println("I am playing.");
		}

}
