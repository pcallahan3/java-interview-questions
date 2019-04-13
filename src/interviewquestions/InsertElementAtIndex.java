package interviewquestions;

import java.util.Arrays;

/*    Insert elements into an array at specified index
 * 
 * 1. Intialize and declare an array of N elements
 * 2. Intialize and declare an index variable to insert new element into
 * 3. Intialize and declare an new element variable to insert at specified index
 * 4. Loop over the length of the array minus 1,i will be greater than insertIndex, decrement
 * 5. Inside the loop swap the length of numOfEle array with the numOfEle length - 1
 * 6. Access the new index and set numOfEle[insertIndex] and set it to the index to the new value
 * 7. Print out the new array using the Array class toString 
 */

public class InsertElementAtIndex {
	
	private int[] numOfElm;
	private int insertIndex;
	private int newValue;
	
	
	public InsertElementAtIndex(int[] numOfElm,int insertIndex ) {
		this.numOfElm = numOfElm;
		this.insertIndex = insertIndex;
	}
	
	
	public void insertNewValue(int newValue) {
		this.newValue = newValue;
	    //move elements below insertion point.
		for(int i=numOfElm.length-1; i > insertIndex; i--){
		    numOfElm[i] = numOfElm[i-1];
		}
		  //insert new value
		numOfElm[insertIndex] = newValue;
		System.out.println(Arrays.toString(numOfElm));
	}

	

}
	
	


