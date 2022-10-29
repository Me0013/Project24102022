package Assignments2;

public class SecurityGuard extends Person {

	public void job() {
		System.out.println("I am a security guard and I patrols and inspects a private building.");
	}
	
	public void salary() {
		System.out.println("My salary is 5000 EUR.");
	}

	public static void main(String args[]) {
	
		SecurityGuard sg = new SecurityGuard();
		
		sg.name = "David";
		sg.age = 60;
		sg.sex = "masculin";
		sg.height = 195.4;
		
		System.out.println(sg.age);
		System.out.println(sg.name);
		System.out.println(sg.sex);
		
		sg.sleep();
		sg.eat();
		sg.drink();
		sg.salary();
		sg.job();
		
		
}



}

