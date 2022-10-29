package ro.katy.tutorial01.Encapsulation;

public class EmployeeTest {

	public static void main(String args[]) {
		
		Employee a = new Employee();
		
		
		// adaug varsta de 20 in int age din Employee
		a.setAge(20);
		
		// iau valoarea 20 din clasa Employee
		System.out.println(a.getAge());
		
		
		
		a.setID(548732);
		System.out.println(a.getID());
		
		a.setName("Anna");
		System.out.println(a.getName());
				
	}
	
}
