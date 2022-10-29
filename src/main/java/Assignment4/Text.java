package Assignment4;

public class Text {
	
	public static void main(String args[]) {
		
		/*Given a large body of text, implement a class with at least three methods that process the text in order to replace a given word with their reverse. 
		 The methods will demonstrate overloading. The three methods of text processing that should be implemented are:
			Using split (using an array and the ‘for’ control structure)
			Using indexOf and substr (using the ‘while’ control structure) 
			Using replace and indexOf (using the ‘do - while’ control structure)
			Note that the methods need to have different but semantically meaningful signatures.
*/
	
		String text1 = "Implement a class with at least three methods that process the text in order to replace a given word with their reverse.";
		//System.out.println(text1);
		
		//Using split (using an array and the ‘for’ control structure)
		String[] arrayText1 = text1.split(" ");
		
		
		for (int i = 0; i < arrayText1.length; i++) {
			//System.out.println(arrayText1[i]);
		}
		
		/*for (int i = arrayText1.length-1; i >= 0; i--) {
			System.out.println(arrayText1[i]);
		}*/
		
		
		//Using indexOf and substr (using the ‘while’ control structure) 
		String word = "process";
		
		//find out the starting point
		int indexProcess = text1.indexOf("process");
		System.out.println(indexProcess);
		
		// find the length of the word	
		int lengthProcess = word.length();
		System.out.println(lengthProcess);

		// add the starting point with length
		int endIndex = indexProcess + lengthProcess;
		System.out.println(endIndex);
		
		
		//
		String s2 = text1.substring(51, 58);
		System.out.println(s2);
		
		String s3 = text1.substring(indexProcess, endIndex);
		System.out.println(s3);
		
		 
		/*for (int i =0; i<s3.length(); i++) {
			char c = s3.charAt(i);
			System.out.println(c);
		}*/
		
		int i=0;
		while (i<s3.length()) {
			char c = s3.charAt(i);
			System.out.println(c);
			i++;
		}
		
		
	}
	
	
	
		//Using replace and indexOf (using the ‘do - while’ control structure)


}
