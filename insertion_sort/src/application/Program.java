package application;

public class Program {
	
	// Insertion Sort is a simple comparison-based sorting algorithm.
	// It builds the sorted array one element at a time by taking the current element
	// and inserting it into its correct position among the previously sorted elements.
	//
	// Time Complexity:
	// - Best case (already sorted): O(n)
	// - Average and Worst case:     O(n^2)
	//
	// Best used for:
	// - Small or nearly sorted datasets.
	// - Scenarios where stable sorting is needed and memory usage should be minimal.

	public static void main(String[] args) {
		
		int vect[] = {9, 1, 8, 2, 7, 3, 6, 5, 4};
		System.out.println("-----Unsorted array-----");
		for(int number : vect) {
			System.out.print(number);
		}
		System.out.println();
		System.out.println("-----Sorted array-----");
		insertionSort(vect);
		for(int number : vect) {
			System.out.print(number);
		}

	}

	private static void insertionSort(int[] vect) {
		
		for(int i = 1; i < vect.length; i++) {
			int temp = vect[i];
			int j = i - 1;
			
			while(j >= 0 && vect[j] > temp) {
				
				vect[j+1] = vect[j];
				j--;
			}
			
			vect[j+1] = temp;
		}
		
	}

}
