package ro.katy.tutorial01.Encapsulation;

public class EncapTest {
	private String name;
	private String idNum; 
	private int age; 
	

	
	//the get method is used to read or retrieve the value of a variable.
	public int getAge() {
		return age; 
	}
	
	public String getName() {
		return name;
	}
	
	public String getIdNum() {
		return idNum;
	}
	
	
	
	//the set method is used to update or allocate a value to a variable 
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setIdNum(String newIdNum) {
		idNum = newIdNum;
	}
	
}



