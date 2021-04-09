package sortingMethods;

public class Sort {

	public static void swap(int[] listToSort, int iIndex, int jIndex) {
		int temp = listToSort[iIndex];
		listToSort[iIndex] = listToSort[jIndex];
		listToSort[jIndex] = temp;

	}

	public static void print(int[] listToSort) {
		System.out.print("[ ");
		for (int el : listToSort) {
			System.out.print(el + ", ");

		}
		System.out.print(']');
		System.out.println();
	}

}
