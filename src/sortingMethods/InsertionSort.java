package sortingMethods;

public class InsertionSort extends Sort {

	public static void insertionSort(int[] listToSort) {
		for (int i = 0; i < listToSort.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (listToSort[j] < listToSort[j - 1]) {
					swap(listToSort, j, j - 1);
				} else {
					break;
				}
				print(listToSort);
			}

		}
	}

	public static void main(String[] args) {
		int Array[] = new int[] { 10, 8, 1, 4, 6, 5, 4, 6, 7, 8, 5, 6, 5, 6 };

		InsertionSort.insertionSort(Array);

	}

}
