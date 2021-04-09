package sortingMethods;

public class QuickSort extends Sort {

	public static int partition(int[] listToSort, int low, int high) {
		int pivot = listToSort[low];
		int l = low;
		int h = high;

		while (l < h) {
			while (listToSort[l] <= pivot && l < h) {
				l++;
			}
			while (listToSort[h] > pivot) {
				h--;
			}
			if (l < h) {
				swap(listToSort, l, h);
			}
		}
		swap(listToSort, low, h);

		System.out.println("Pivot: " + pivot);
		print(listToSort);
		return h;
	}

	public static void quickSort(int[] listToSort, int low, int high) {
		if (low >= high) {
			return;
		}
		int pivotIndex = partition(listToSort, low, high);
		quickSort(listToSort, low, pivotIndex - 1);
		quickSort(listToSort, pivotIndex + 1, high);

	}

	public static void main(String[] args) {
		int Array[] = new int[] { 10, 8, 1, 4, 6, 5, 4, 6, 7, 8, 5, 6, 5, 6 };

		QuickSort.quickSort(Array, 0, Array.length - 1);

	}

}
