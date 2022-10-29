package Assignments2;

public class Professor extends Person {

	public void job() {
		System.out.println("I am a professor and I teach students.");
	}
	
	public void salary() {
		System.out.println("My salary is 8700 EURO.");
	}
	
	public static void main(String args[]) { 
	Professor p = new Professor();
	
	p.age = 30;
	p.height = 180.5;
	p.sex = "masculin";
	p.name = "Mihai";
	
	System.out.println("My name is " + p.name + ", my age is " + p.age + ", I am " + p.height + " and I am " + p.sex + "." );

	p.drink();
	p.eat();
	p.job();
	p.salary();
	p.sleep();
	
	}
	
}
