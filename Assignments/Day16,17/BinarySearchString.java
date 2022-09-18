package Assignment1;

public class BinarySearchString {

	public static void main(String[] args) {
		String[] arr = { "Chennai", "coimbature", "madurai", "thirucy" };
		String x = "Chennai";
		int result = Search(arr, x);
		if (result == -1) {
			System.out.println("Element not present");
		}
		else {
			System.out.println("Element found at " + result + " index");
		}
	}

	static int Search(String[] arr, String x) {
		int l = 0, len = arr.length - 1;
		while (l <= len) {
			int m = l + (len - l) / 2;
			int res = x.compareTo(arr[m]);
			if (res == 0) {
				return m;
			}
			if (res > 0) {
				l = m + 1;
			}
			else {
				len = m - 1;
			}
		}
		return -1;
	}
}
