package sortingMethods;

public class SelectionSort extends Sort {

	public static void selectionSort(int[] listToSort) {
		for (int i = 0; i < listToSort.length; i++) {
			for (int j = i + 1; j < listToSort.length; j++) {
				if (listToSort[i] > listToSort[j]) {
					swap(listToSort, i, j);
					print(listToSort);
				}
			}
		}
	}

	public static void main(String[] args) {
		int Array[] = new int[] { 10, 8, 1, 4, 6, 5, 4, 6, 7, 8, 5, 6, 5, 6 };

		SelectionSort.selectionSort(Array);
	}

}
