package sortingMethods;

public class BubbleSort extends Sort {

	public static void bubbleSort(int[] listToSort) {
		for (int i = 0; i < listToSort.length; i++) {
			boolean swapped = false;
			for (int j = listToSort.length - 1; j > i; j--) {
				if (listToSort[j] < listToSort[j - 1]) {
					swap(listToSort, j, j - 1);
					swapped = true;
				}
			}
			print(listToSort);
			if (!swapped) {
				break;
			}
		}

	}

	public static void main(String args[]) {
		int Array[] = new int[] { 10, 8, 1, 4, 6, 5, 4, 6, 7, 8, 5, 6, 5, 6 };

		BubbleSort.bubbleSort(Array);

	}
}
