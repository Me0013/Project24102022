package Abstraction;

public class Pig extends Animal {
	public void animalSound() {
		System.out.println("The pig says: oinks.");
	}
	
	public void animalEat() {
		System.out.println("The pig eats ...");
	}
	
	public static void main(String args[]) {
		
		Pig buble = new Pig();
		
		buble.animalSound();
		buble.sleep();
		buble.animalEat();
	}
	
}
