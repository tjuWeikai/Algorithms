package algorithm.chapter1.search;

/**
 * 
 * @author zhangweikai
 * 
 * binary search implement, including non-factorial and factorial version.
 *
 */
public class BinarySeach {

	public static void main(String[] args) {

		int[] sortedArray = new int[] { 1, 2, 3, 4, 5,9,12,13,19 };
//		System.out.println(getTheDigit(sortedArray, 19));
		System.out.println(getTheDigitByFactorial(sortedArray, 20, 0, sortedArray.length - 1));

	}

	public static boolean getTheDigit(int[] sortedArray, int target) {

		int start = 0;
		int end = sortedArray.length - 1;
		int pos = end / 2;

		if (sortedArray[start] > target || sortedArray[end] < target) {
			return false;
		}

		while (start <= end) {
			if (target < sortedArray[pos]) {
				// That's important to move one step back
				end = pos - 1; 
				pos = (start + end) / 2;
			} else if (target > sortedArray[pos]) {
				// plus one
				start = pos + 1; 
				pos = (start + end) / 2;
			} else {
				return true;
			}
		}

		return false;
	}

	public static boolean getTheDigitByFactorial(int[] sortedArray, int target, int start, int end) {
		
		int pos = (start + end) / 2;
		if (start > end) {
			return false;
		}

		if (target < sortedArray[pos]) {
			end = pos - 1;
			pos = (start + end) / 2;
		} else if (target > sortedArray[pos]) {
			start = pos + 1;
			pos = (start + end) / 2;
		} else {
			return true;
		}

		return getTheDigitByFactorial(sortedArray, target, start, end);
	}

}
