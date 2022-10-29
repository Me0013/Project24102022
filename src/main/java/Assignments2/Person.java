package Assignments2;

public abstract class Person {
	int age;
	String name;
	String sex; 
	Double height;
	

	public abstract void job();
	public abstract void salary();
	
	
	public void eat() {
		System.out.println("I eat daily.");
	}

	public void drink() {
		System.out.println("I drink.");
	}
	
	public void sleep() {
		System.out.println("I sleep every night.");
	}
	
}


/*Write a class that represents an abstract person. 
 * Extend that class for particular types of people: 
 * professor, student, janitor, security guard, each with job specific methods,
 *  and common methods that they override, in their specific way.*/
