package org.technoangel.interview;

public class Permutation {
	
	/**
	 * Check if the sub-selection process is still needed
	 * @param traverseIndex 
	 * @param endIndex
	 * @param howManyToChoose
	 * @param startIndex
	 * @return
	 */
	public boolean stillSelecting(int traverseIndex, int endIndex, int howManyToChoose, int startIndex) {
		// Has traverseIndex exceeded the end boundary index?
		boolean withinBounds = traverseIndex <= endIndex;
		
		// Are there still choices needed to be made?
		boolean stillMoreToChoose = endIndex - traverseIndex + 1 >= howManyToChoose - startIndex;
		
		return withinBounds && stillMoreToChoose;
	}
	
	/**
	 * Recursively create a list of combinations of objects of a certain size
	 * @param setOfObjects Original set of objects
	 * @param tempCollection Currently populated subset of objects
	 * @param startIndex Which current object is the start for this run
	 * @param endIndex Which current object is the end for this run
	 * @param currentIndex Which object currently is being examined
	 * @param howManyToChoose How many to select
	 */
	public <T> void combinationUtil(T[] setOfObjects, T[] tempCollection, int startIndex, int endIndex, int currentIndex, int howManyToChoose) {
		
		// If we have the final selection...
		if (currentIndex == howManyToChoose) {
			
			// Iterate over the sub-selection...
			for(int displayIndex = 0; displayIndex < howManyToChoose; displayIndex++) {
				// Send the elements to standard out
				System.out.print(tempCollection[displayIndex] + " ");
			}
			
			// Finish user display
			System.out.println("");
			
			// Exit the recursion for this iteration
			return;
		}
		
		// ...otherwise, loop from the current start to the limit of this run... 
		for (int traverseIndex = startIndex; 
			 stillSelecting(traverseIndex, endIndex, howManyToChoose, startIndex);
			 traverseIndex++) {
			
			// Add the current object to our temp array
			tempCollection[currentIndex] = setOfObjects[traverseIndex];
			
			// Call for a combination starting one element further
			combinationUtil(setOfObjects, tempCollection, traverseIndex + 1, endIndex, 
					currentIndex + 1, howManyToChoose);
		}
	}
	
	/**
	 * Given a set of Strings and the fixed number to choose,
	 * show all combinations of those Strings
	 * @param setOfObjects set of String to choose from
	 * @param howManyToChoose fixed number to select
	 */
	public <T> void printCombinations(T[] setOfObjects, int howManyToChoose) {
		
		int numberOfObjects = setOfObjects.length;
		T[] tempCollection = (T[])new Object[numberOfObjects];
		combinationUtil(setOfObjects, tempCollection, 0, numberOfObjects -1, 0, howManyToChoose);
	}
}
