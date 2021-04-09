package sortingMethods;

public class ShellSort extends Sort {

	public static void insertionSort(int[] listToSort, int startIndex, int increment) {
		for (int i = startIndex; i < listToSort.length; i = i + increment) {
			for (int j = Math.min(i + increment, listToSort.length - 1); j - increment >= 0; j = j - increment) {
				if (listToSort[j] < listToSort[j - increment]) {
					swap(listToSort, j, j - increment);
				} else {
					break;
				}
				print(listToSort);
			}

		}
	}

	public static void shellSort(int[] listToSort) {
		int increment = listToSort.length / 2;
		while (increment >= 1) {
			for (int startIndex = 0; startIndex < increment; startIndex++) {
				insertionSort(listToSort, startIndex, increment);
			}
			increment = increment / 2;
		}
	}

	public static void main(String[] args) {
		
		int Array[] = new int[] { 10, 8, 1, 4, 6, 5, 4, 6, 7, 8, 5, 6, 5, 6 };
		ShellSort.shellSort(Array);
	}

}
