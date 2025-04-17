package application;


public class Program {
	
		// Selection Sort:
		// Sorts an array by repeatedly finding the minimum element from the unsorted part
		// and moving it to the beginning. Simple and in-place.
		//
		// Time complexity: O(n^2) in all cases.
		//
		// Not stable. Inefficient for large datasets.
		// Best used for small arrays or when memory is limited.

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
