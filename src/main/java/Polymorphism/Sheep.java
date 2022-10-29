package Polymorphism;

public class Sheep extends Anim{
	/*public void animSound() {
		System.out.println("The sheep makes something else. ");
	}*/

	public static void main(String args[]) {
		
		Bear my = new Bear();
		Sheep m = new Sheep();
		Anim a = new Anim();
		
		my.animSound();
		m.animSound();
		a.animSound();
		}
	
}
