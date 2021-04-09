package searchMethods;

public class BinarySearch {

	public static int binarySearch(int[] sortedList, int number) {
		int min = 0;
		int max = sortedList.length - 1;

		while (min <= max) {
			int mid = min + (max - min) / 2;
			if (sortedList[mid] == number) {
				return mid;
			}
			if (sortedList[mid] > number) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
		}
		
		return -1;
	}

	public static void main (String[] args) {
		
		int Array[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(BinarySearch.binarySearch(Array, 9));
		System.out.println(BinarySearch.binarySearch(Array, 11));
		
	}
	
}
