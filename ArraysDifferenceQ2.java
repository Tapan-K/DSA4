package in.ineuron.assign4;

import java.util.*;

public class ArraysDifferenceQ2 {
	public List<List<Integer>> findArraysDifference(int[] nums1, int[] nums2) {
		List<List<Integer>> result = new ArrayList<>();

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (int num : nums1) {
			set1.add(num);
		}

		for (int num : nums2) {
			set2.add(num);
		}

		List<Integer> diff1 = new ArrayList<>();
		for (int num : nums1) {
			if (!set2.contains(num)) {
				diff1.add(num);
			}
		}
		result.add(diff1);

		// Find distinct elements in nums2 that are not present in nums1
		List<Integer> diff2 = new ArrayList<>();
		for (int num : nums2) {
			if (!set1.contains(num)) {
				diff2.add(num);
			}
		}
		result.add(diff2);

		return result;
	}

	public static void main(String[] args) {
		// Question 2
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 2, 4, 6 };

		ArraysDifferenceQ2 solution = new ArraysDifferenceQ2();
		List<List<Integer>> result = solution.findArraysDifference(nums1, nums2);

		System.out.println("Output: " + result);

	}

}
