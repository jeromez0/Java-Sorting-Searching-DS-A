package sortingMethods;

public class MergeSort extends Sort {

	public static void mergeSort(int[] listToSort) {
		if (listToSort.length == 1) {
			return;
		}

		int midIndex = listToSort.length / 2 + listToSort.length % 2;
		int[] listFirstHalf = new int[midIndex];
		int[] listSecondHalf = new int[listToSort.length - midIndex];
		split(listToSort, listFirstHalf, listSecondHalf);

		mergeSort(listFirstHalf);
		mergeSort(listSecondHalf);

		merge(listToSort, listFirstHalf, listSecondHalf);
		print(listToSort);
	}

	public static void split(int[] listToSort, int[] listFirstHalf, int[] listSecondHalf) {
		int index = 0;
		int secondHalfStartIndex = listFirstHalf.length;
		for (int elements : listToSort) {
			if (index < secondHalfStartIndex) {
				listFirstHalf[index] = listToSort[index];
			} else {
				listSecondHalf[index - secondHalfStartIndex] = listToSort[index];
			}
			index++;
		}
	}

	public static void merge(int[] listToSort, int[] listFirstHalf, int[] listSecondHalf) {
		int mergeIndex = 0;
		int firstHalfIndex = 0;
		int secondHalfIndex = 0;

		while (firstHalfIndex < listFirstHalf.length && secondHalfIndex < listSecondHalf.length) {
			if (listFirstHalf[firstHalfIndex] < listSecondHalf[secondHalfIndex]) {
				listToSort[mergeIndex] = listFirstHalf[firstHalfIndex];
				firstHalfIndex++;
			} else if (secondHalfIndex < listSecondHalf.length) {
				listToSort[mergeIndex] = listSecondHalf[secondHalfIndex];
				secondHalfIndex++;
			}
			mergeIndex++;
		}

		if (firstHalfIndex < listFirstHalf.length) {
			while (mergeIndex < listToSort.length) {
				listToSort[mergeIndex++] = listFirstHalf[firstHalfIndex++];
			}
		}
		if (secondHalfIndex < listSecondHalf.length) {
			while (mergeIndex < listToSort.length) {
				listToSort[mergeIndex++] = listSecondHalf[secondHalfIndex++];
			}
		}
	}

	public static void main(String[] args) {
		int Array[] = new int[] { 10, 8, 1, 4, 6, 5, 4, 6, 7, 8, 5, 6, 5, 6 };

		MergeSort.mergeSort(Array);

	}

}
