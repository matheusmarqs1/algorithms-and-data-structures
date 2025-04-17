package application;

public class Program {
	
	// Quick Sort:
	// An efficient, divide-and-conquer sorting algorithm that selects a 'pivot' element,
	// partitions the array into two sub-arrays (less than and greater than the pivot),
	// and recursively sorts them.
	//
	// Time Complexity:
	// - Best case:    O(n log n)
	// - Average case: O(n log n)
	// - Worst case:   O(n^2) – occurs when pivot choices consistently lead to unbalanced partitions
	//
	// Best used for:
	// - Large datasets where performance is important.
	// - General-purpose sorting when memory usage can be optimized.
	// - When average-case speed is more important than guaranteed worst-case performance.
	//
	// Note: Not a stable sort (equal elements may be reordered).

	public static void main(String[] args) {
		
		int vect[] = {8, 2, 5, 3, 9, 4, 7, 6, 1};
		System.out.println("-----Unsorted array-----");
		for(int number : vect) {
			System.out.print(number);
		}
		quickSort(vect, 0, vect.length - 1);
		System.out.println();
		System.out.println("-----Sorted array-----");
		for(int number : vect) {
			System.out.print(number);
		}

	}

	private static void quickSort(int[] vect, int left, int right) {
		
		if(right <= left) return;
		
		int pivot = partition(vect, left, right);
		quickSort(vect, left, pivot - 1);
		quickSort(vect, pivot + 1, right);
	}

	private static int partition(int[] vect, int left, int right) {
		
		int pivot = vect[right];
		int i = left - 1;
		
		for(int j = left; j <= right - 1; j++ ) {
			if(vect[j] < pivot) {
				i++;
				int temp = vect[i];
				vect[i] = vect[j];
				vect[j] = temp;
			}
		}
		i++;
		int temp = vect[i];
		vect[i] = vect[right];
		vect[right] = temp;
		
		return i;
	}

}
