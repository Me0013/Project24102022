package ro.katy.tutorial01.Encapsulation;

public class Employee {

	private int age;
	private String name; 
	private int ID;

	
	
	//the get method is used to read or retrieve the value of a variable.
	public int getID() {
		return ID;
	}
	

	public String getName() {
		return name;
	}
	
	public int getAge() { //4. de la pasul 3, age e 20 => get Age = 20 
		return age; 
	}
	//	System.out.println(a.getAge()); //5. print 20
	
	
	
	
	//the get method is used to read or retrieve the value of a variable.
	public void setAge(int newAge) { // 2.  newAge = 20 {
		age = newAge; //3. age = 20
	}
	//1. a.setAge(20);
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setID(int newID) {
		ID = newID;
	}
}


