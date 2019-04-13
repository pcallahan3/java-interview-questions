package interviewquestions;

import java.util.HashMap;

public class InterviewQuestionsDriver {
	
	public static void main(String[] args) {
		
		//Create new ReverseString object
		ReverseString reverseStr = new ReverseString("Lets it");
		
		//Create a new Swap2Vars object
		Swap2Vars swap2Vars = new Swap2Vars();
		swap2Vars.beforeSwap(10, 12);
		
		//Create a new CountWordsInAHashmap object
		CountWordsInHashmap newMap = new CountWordsInHashmap("Hello hello to all the wordld");
		
		int[] indexOfElm = new int[20];
		InsertElementAtIndex newElement = new InsertElementAtIndex(indexOfElm, 2);
		newElement.insertNewValue(19900);
		
		
		
	}

}
	

