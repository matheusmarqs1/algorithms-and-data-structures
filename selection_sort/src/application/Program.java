package application;


public class Program {
	
	// Selection Sort:
	// Sorts an array by repeatedly finding the minimum element from the unsorted part
	// and swapping it with the first unsorted element. Simple and in-place.
	//
	// Time Complexity:
	// - Best case:    O(n²)
	// - Average case: O(n²)
	// - Worst case:   O(n²)
	//
	// Best used for:
	// - Small arrays where memory usage must be minimal.
	// - Situations where performance is not critical.
	//
	// Note: Not a stable sort (equal elements may lose their original order).


	public static void main(String[] args) {
		
		int vect[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};
		
		System.out.println("-----Unsorted array-----");
		for(int number : vect) {
			System.out.print(number);
		}
		System.out.println();
		System.out.println("-----Sorted array-----");
		selectionSort(vect);
		for(int number : vect) {
			System.out.print(number);
		}
		
	}

	private static void selectionSort(int[] vect) {
		
		for(int i = 0; i < vect.length - 1; i++) {
			
			int min = i;
			
			for(int j = i + 1; j < vect.length; j++) {
				if(vect[min] > vect[j]) {
					min = j;
				}
			}
			int temp = vect[i];
			vect[i] = vect[min];
			vect[min] = temp;
		}
		
	}

}
