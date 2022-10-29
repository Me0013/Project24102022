package ro.katy.tutorial01.Encapsulation;

public class Buletin {

	private int CNP;
	private int serie;
	private String nume; 
	
	
	//the set method is used to update or allocate a value to a variable 
	public void setCNP(int newCNP) {
		CNP = newCNP;
	}
	
	public void setSerie(int newSerie) {
		serie = newSerie; 
	}
	
	public void setNume(String newNume) {
		nume = newNume;
	}
	
	//the get method is used to read or retrieve the value of a variable.
	public int getCNP() {
		return CNP;
	}
	
	public int getSerie() {
		return serie;
	}
	
	public String getNume() {
		return nume; 
	}
	
	
	//	meu.setCNP(2900424);
	
	//System.out.println(meu.getCNP());
	//}

	// Pasul 1. private int CNP;
	// Pasul 2. public void setCNP(int newCNP){ 		CNP = newCNP; 		}
	// Pasul 3. public int getCNP() { 		return CNP;			}
	// Pasul 4. obj.setCNP(..........);
	// Pasul 5. Print(obj.getCNP());
	
	
	
	
	
	
	
	
	
	
	
	
	
}
