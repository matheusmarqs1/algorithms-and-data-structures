package application;

public class Program {

	// Linear Search Algorithm
	// This algorithm searches for a target element in an array by checking each element sequentially.
	// If the target is found, it returns its index; otherwise, it returns -1.
	
	// Advantages:
	// 1. Simple and easy to implement.
	// 2. Does not require the array to be sorted.
	// 3. Works well for small datasets or when elements are scattered.
	
	// Disadvantages:
	// 1. Inefficient for large datasets, with a time complexity of O(n).
	// 2. Can be slower compared to more advanced algorithms like binary search (which requires sorting).
	
	public static void main(String[] args) {
		
		int[] vect = {9, 1, 8, 2, 7, 3, 6, 4, 5};
		
		int index = linearSearch(vect, 8);
		
		if(index != -1) {
			System.out.println("Element found at index: " + index);
		}
		else {
			System.out.println("Element not found");
		}

	}

	private static int linearSearch(int[] vect, int value) {
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] == value) {
				return i;
			}
		}
		return -1;
	}

}
