package interviewquestions;

/*  	Swap 2 numbers without using a 3rd variable
 * 
 * 1. Intialize and declare 2 int variables
 * 2. Print variables before swap
 * 3. Add variable a to variable b
 * 4. Subtract variable b from variable a
 * 5. Subtract variable a from variable b
 */
public class Swap2Vars {
	
	private int a;
	private int b;
	
	public Swap2Vars() {
		
	}
	
	

	public void beforeSwap(int a ,int b) {
		int variableA = a;
		int varaibvleB = b;
		System.out.println("Variables before swap " + a + "," + b);	
		afterSwap(variableA, varaibvleB);
	}
	
	public void afterSwap(int a,int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Variables after swap " + a + "," + b);	
		System.out.println("");
		
	}
}
