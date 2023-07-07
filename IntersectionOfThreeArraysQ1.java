package in.ineuron.assign4;

import java.util.*;

public class IntersectionOfThreeArraysQ1 {
	public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
		List<Integer> intersection = new ArrayList<>();

		int i = 0, j = 0, k = 0;

		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			int num1 = arr1[i];
			int num2 = arr2[j];
			int num3 = arr3[k];

			if (num1 == num2 && num2 == num3) {
				intersection.add(num1);
				i++;
				j++;
				k++;
			} else {
				if (num1 <= num2 && num1 <= num3) {
					i++;
				} else if (num2 <= num1 && num2 <= num3) {
					j++;
				} else {
					k++;
				}
			}
		}

		return intersection;
	}

	public static void main(String[] args) {
		// Question 1

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 5, 7, 9 };
		int[] arr3 = { 1, 3, 4, 5, 8 };

		IntersectionOfThreeArraysQ1 solution = new IntersectionOfThreeArraysQ1();
		List<Integer> intersection = solution.arraysIntersection(arr1, arr2, arr3);

		System.out.println("Output: " + intersection);

	}

}
