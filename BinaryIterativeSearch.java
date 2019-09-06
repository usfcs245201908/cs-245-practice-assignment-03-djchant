public class BinaryIterativeSearch implements Practice03Search {
	public String searchName() {
		return ("Binary Iterative Search");
	}

	public int search(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;

		while(low <= high) {
			int mid = (high + low) / 2;
			if(arr[mid] == target) {
				return mid;
			} else if(arr[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1;
	} 
}