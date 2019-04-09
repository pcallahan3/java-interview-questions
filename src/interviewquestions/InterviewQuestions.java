package interviewquestions;

import java.util.HashMap;

public class InterviewQuestions {
	
	public static void main(String[] args) {
		
	
		reverseStr();
		swap2Vars();	
		countWordsInHashMap();
	}
	

	/*       Reverse a string 
	 * 
	 * 1. Intialize and declare  a string variable 
	 * 2. Convert string to a char array
	 * 3. Loop over length of char array minus 1
	 * 4. Decrement length
	 * 5. Print length of char array
	 */
private static void reverseStr() {
	String reverseStr = "Hello world";
	char[] reverseStrChar = reverseStr.toCharArray();
	for(int i = reverseStr.length()- 1; i >= 0 ; i--) {
		System.out.print(reverseStrChar[i]);
	}
	System.out.println("");
	System.out.println("");
	
	}

/*  	Swap 2 numbers without using a 3rd variable
 * 
 * 1. Intialize and declare 2 int variables
 * 2. Print variables before swap
 * 3. Add variable a to variable b
 * 4. Subtract variable b from variable a
 * 5. Subtract variable a from variable b
 */
private static void swap2Vars() {
	int a = 5;
	int b = 50;
	System.out.println("Variables before swap " + a + "," + b);
	a = a + b;
	b = a - b;
	a = a - b;
	
	System.out.println("Variables after swap " + a + "," + b);
	System.out.println("");
	
	
}


/*  	Count the number of words in a String using a Hashmap
 * 
 * 1. Intialize and declare a string of words
 * 2. Intialize and declare a string array and split the first varaible of words where this 
 * is whitespace
 * 3. Intialize and declare a Hashmap with data types String as key and Integer as value
 * 4. Loop over the length of the splited words array
 * 5. Check if the split words are contained in the key of the Hashmap
 * 6. Intialize and declare a count variable that will get the count of each word 
 * 7. Map the counted words 
 * 8. Print the words and the count
 */
private static void countWordsInHashMap() {
	
	String countWords = "This is a a test test to count words in a string!";
	String[] splitWords = countWords.split(" ");
	HashMap<String, Integer> mapWords = new HashMap<>();
	for(int i = 0; i < splitWords.length -1; i++) {
		if(mapWords.containsKey(splitWords[i])) {
			int count = mapWords.get(splitWords[i]);
			mapWords.put(splitWords[i], count+1);
		}
		else {
			mapWords.put(splitWords[i], 1);

		}
		System.out.println(mapWords);
	}
	
}
}
	

