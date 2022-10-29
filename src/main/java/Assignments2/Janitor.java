package Assignments2;

public class Janitor extends Person{

	public void job() {
		System.out.println("I am a janitor in an hospital.");
	}
	
	public void salary() {
		System.out.println("My salary is 3200 EUR");
	}
 	
	
	public static void main(String args[]) {
		
		Janitor j = new Janitor(); 
		
		j.name = "Ovidiu";
		j.age = 45;
		j.height = 173.4;
		j.sex = "masculin";
		
		j.drink();
		j.eat();
		j.sleep();
		j.salary();
		System.out.println(j.age);
		System.out.println(j.name);
		
		
		
	}
	
}
