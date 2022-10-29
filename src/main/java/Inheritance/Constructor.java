package Inheritance;

public class Constructor extends Employee {
	
	public Constructor(int salary, String name, String workplace) {
		super(salary, name, workplace);
	}

	
	public static void main(String args[]) {
		
		Constructor a = new Constructor(2000, "Alex", "Depo");
		
		a.leavingWork();
		a.goingToWork();
		a.takingBreaks();
		
		System.out.println("I am " + a.name + ", I work at " + a.workplace + " and my salary is " + a.salary);

}
	
}
