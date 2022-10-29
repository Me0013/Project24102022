package Abstraction;

 public abstract class Animal {

	 public abstract void animalSound();
	 public abstract void animalEat();
	 
	 public void sleep() {
		 System.out.println("zzzz");
	 }
}

 //Abstraction is a process of hiding unnecessary data and showing only relevant data.
 //The class which implements the abstraction can be used as a parent class by inheriting them, hence improving reusability, and reducing duplication.
 //Abstraction represents only useful data, whereas encapsulation wraps data and codes for necessary information. 
 //Moreover, it helps developers to easily organize the whole code.
 
 //The process of fetching, removing, and selecting the customer information from a pool of data is called Abstraction.
 //you don’t need to know how your camera recognizes a human face in an image or how it calculates gamma correction. 
 //You simply need to learn the software interface. So, it is a real-world example of encapsulation.