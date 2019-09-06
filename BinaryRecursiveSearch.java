public class BinaryRecursiveSearch implements Practice03Search {
	public String searchName() {
		return ("Binary Recursive Search");
	}

	public int search(int[] arr, int target) {
		int high = arr.length - 1;
		int low = 0;
		return search(arr, target, high, low);
	}

	public int search(int[] arr, int target, int high, int low) {
		int mid = (low + high) / 2;
		if(low > high) {
			return -1;
		}

		if(arr[mid] == target) {
			return mid;
		} else if(arr[mid] > target) {
			return search(arr, target, mid - 1, low);
		} else {
			return search(arr, target, high, mid + 1);
		}
	}
}