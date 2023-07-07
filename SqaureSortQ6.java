package in.ineuron.assign4;

import java.util.Arrays;

public class SqaureSortQ6 {
	public int[] sortedSquares(int[] nums) {
		int[] result = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			result[i] = nums[i] * nums[i];
		}

		Arrays.sort(result);

		return result;
	}

	public static void main(String[] args) {
		// Question 6
		int[] nums = { -4, -1, 0, 3, 10 };

		SqaureSortQ6 solution = new SqaureSortQ6();
		int[] sortedSquares = solution.sortedSquares(nums);

		System.out.println("Output: " + Arrays.toString(sortedSquares));

	}

}
