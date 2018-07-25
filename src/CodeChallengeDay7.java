import java.util.Arrays;

public class CodeChallengeDay7 {

	public static void main(String[] args) {
		int[] arr = {98, 43, 22};
		int[] newArray = smallerLarger(arr);
		System.out.println(Arrays.toString(newArray));
	}

	public static int[] test(int[] array) {
		int[] nums = { 1, 2, 3 };
		return nums;
	}

	public static int[] smallerLarger(int[] array) {
		int large = 0;

		if (array[0] > array[array.length - 1]) {
			large = array[0];
		} else {
			large = array[array.length - 1];
		}
		
		// going through each index and changing to the largest value
		for (int i = 0; i < array.length; i++) {
			array[i] = large;
		}
		// Arrays.fill(nums, temp); also valid solution.
		return array;
	}
}