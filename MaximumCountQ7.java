package in.ineuron.assign4;

public class MaximumCountQ7 {
	public int maxCount(int m, int n, int[][] ops) {
		int minRow = m;
		int minCol = n;

		for (int[] op : ops) {
			minRow = Math.min(minRow, op[0]);
			minCol = Math.min(minCol, op[1]);
		}

		return minRow * minCol;
	}

	public static void main(String[] args) {
		// Question 7
		int m = 3;
		int n = 3;
		int[][] ops = { { 2, 2 }, { 3, 3 } };

		MaximumCountQ7 solution = new MaximumCountQ7();
		int maxCount = solution.maxCount(m, n, ops);

		System.out.println("Output---> : " + maxCount);

	}

}
