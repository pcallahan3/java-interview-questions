package interviewquestions;

/*       Reverse a string 
 * 
 * 1. Intialize and declare  a string variable 
 * 2. Convert string to a char array
 * 3. Loop over length of char array minus 1
 * 4. Decrement length
 * 5. Print length of char array
 */
public class ReverseString {
	
	
	public ReverseString(String reverseStr) {
		String stringReverse = reverseStr;
		char[] reverseStrChar = stringReverse.toCharArray();
		for(int i = stringReverse.length()- 1; i >= 0 ; i--) {
			System.out.print(reverseStrChar[i]);
		}
		System.out.println("");
		System.out.println("");
		
	}




}
