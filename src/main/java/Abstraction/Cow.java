package Abstraction;

 class Cow extends Animal {
	 public void animalSound() {
		 System.out.println("The cow says: Moo");
	 }
	 
	 public void animalEat() {
		 System.out.println("The cow eats grass.");
	 }

	 public static void main(String args[]) {
		 Cow myCow = new Cow();
		 myCow.animalSound();
		 myCow.sleep();
		 myCow.animalEat();
	 }
	 
	 
}
