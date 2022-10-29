package ro.katy.tutorial01.Encapsulation;

class Test{  
public static void main(String[] args){  
	//creating instance of the encapsulated class  
		
	Student s=new Student();  
	
	//setting value in the name member  
	s.setName("vijay");  
	
	//getting value of the name member  
	System.out.println(s.getName());  
	
	Student a = new Student();
	a.setName("Victor");
	
	System.out.println(a.getName());  
	}  
}  