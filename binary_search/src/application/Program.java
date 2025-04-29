package application;

public class Program {
	
	// Binary Search Algorithm:
	// Binary search is an efficient method to find an element in a **sorted** array.
	// It works by repeatedly dividing the search interval in half and comparing the middle value to the target.
	// If the middle value is less than the target, the search continues in the upper half; 
	// if it's greater, it continues in the lower half.

	// Advantages:
	// - Much faster than linear search on large datasets (time complexity O(log n)).
	// - Simple to implement.

	// Disadvantages:
	// - Only works correctly if the array is sorted.
	// - Slightly more complex than linear search for very small arrays, where performance gain is negligible.

	public static void main(String[] args) {
		
		int vect[] = new int[100];
		int target = 42;
		
		for(int i = 0; i < vect.length; i++) {
			vect[i] = i;
		}
		
		int index = binarySearch(vect, target);
		
		if(index == -1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at index " + index);
		}

	}

	private static int binarySearch(int[] vect, int target) {
		
		int low = 0;
		int high = vect.length - 1;
		
		while(low <= high) {
			
			int middle = low + (high - low) / 2;
			int value = vect[middle];
			
			System.out.println("Middle: " + middle);
			
			if(value < target) low = middle + 1;
			else if(value > target) high = middle - 1;
			else return middle; // target found
		}
		return -1;

	}
}
