package Assignments2;

public class Student extends Person{

	public void job() {
		System.out.println("My job is to learn and to practice what I have learned.");
	}
	
	public void salary() {
		System.out.println("I do not have any salary yet.");
	}
	
	
	public static void main(String args[]) {

		Student s = new Student();
		
		s.age = 19;
		s.height = 167.0;
		s.sex = "Feminin";
		s.name = "Ana";
		
		s.sleep();
		s.drink();
		s.eat();
		s.salary();
		s.job();
		
		System.out.println("Hello, my name is " + s.name + " and my age is " + s.age + " .");
		
		
		
	}
	
	
}
