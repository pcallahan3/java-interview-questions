package interviewquestions;

import java.util.HashMap;


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
public class CountWordsInHashmap {
	
	private String wordsToCount;
	private HashMap<String, Integer> mapWords;
	private String[] splitWords;
	
	public CountWordsInHashmap(String wordsToCount) {
		String countWords = wordsToCount;
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
