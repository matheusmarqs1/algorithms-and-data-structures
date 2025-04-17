package application;

public class Program {
	
	// Bubble Sort is a simple comparison-based sorting algorithm.
	// It repeatedly steps through the array, compares adjacent elements,
	// and swaps them if they are in the wrong order. This process is repeated
	// until the array is fully sorted.
	//
	// Time Complexity:
	// - Best case (already sorted): O(n)
	// - Average and Worst case: O(n^2)
	//
	// Best used for:
	// - Very small or nearly sorted datasets where performance is not critical.
	// - When simplicity is preferred over efficiency.

	public static void main(String[] args) {
		
		int vect[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
		System.out.println("------Unsorted Array-----");
		for(int number : vect) {
			System.out.print(number);
		}
		bubbleSort(vect);
		System.out.println();
		System.out.println("\n------Sorted array-----");
		for(int number : vect) {
			System.out.print(number);
		}

	}
	
	public static void bubbleSort(int vect[]) {
		for(int i = 0; i < vect.length - 1; i++) {
			for(int j = 0; j < vect.length - i - 1; j++) {
				if(vect[j] > vect[j + 1]) {
					int temp = vect[j];
					vect[j] = vect[j+1];
					vect[j+1] = temp;
				}
			}
		}
	}

}
