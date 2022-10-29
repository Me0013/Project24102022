package ro.katy.tutorial01.Encapsulation;

public class RunEncap {
	
	public static void main(String args[]) {
		
		EncapTest encap = new EncapTest();
		encap.setName("James");
		encap.setIdNum("2369SM");
		encap.setAge(20);
		
		  System.out.println("Name : " + encap.getName() + " Age : " + encap.getAge());	
		  System.out.println("The student " + encap.getName() + " has the ID Num " + encap.getIdNum() + ".");
	}

}
