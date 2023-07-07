package in.ineuron.assign4;

import java.util.Arrays;

public class ArrayInX1Y1Q8 {
	public int[] arrayInX1Y1(int[] nums, int n) {
		int[] result = new int[2 * n];
		int index = 0;

		for (int i = 0; i < n; i++) {
			result[index++] = nums[i];
			result[index++] = nums[i + n];
		}

		return result;
	}

	public static void main(String[] args) {
		// Question 8
		int[] nums = { 2, 5, 1, 3, 4, 7 };
		int n = 3;

		ArrayInX1Y1Q8 solution = new ArrayInX1Y1Q8();
		int[] ArrayX1Y1 = solution.arrayInX1Y1(nums, n);

		System.out.println("Output: " + Arrays.toString(ArrayX1Y1));

	}

}
