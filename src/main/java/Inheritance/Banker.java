package Inheritance;

public class Banker extends Employee {
	
	public Banker(int salary, String name, String workplace) {
		super(salary, name, workplace);
	}

	public static void main(String args[]) { 
	Banker one = new Banker(10000, "Mateo", "ING" );
	
	one.goingToWork(); 
	one.leavingWork();
	one.takingBreaks();
	
	System.out.println("I am " + one.name + ", I work at " + one.workplace + " and my salary is " + one.salary);

	
}

}