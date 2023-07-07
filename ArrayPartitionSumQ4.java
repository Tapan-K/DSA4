package in.ineuron.assign4;

import java.util.Arrays;

public class ArrayPartitionSumQ4 {
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums); // Sorting the array in ascending order
		int maxSum = 0;

		for (int i = 0; i < nums.length; i += 2) {
			maxSum += nums[i];
		}

		return maxSum;
	}

	public static void main(String[] args) {
		// Question 4
		int[] nums = { 1, 4, 3, 2 };

		ArrayPartitionSumQ4 solution = new ArrayPartitionSumQ4();
		int maxSum = solution.arrayPairSum(nums);

		System.out.println("Output: " + maxSum);

	}

}
