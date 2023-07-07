package in.ineuron.assign4;

public class CoinArrangementQ5 {
	public int arrangeCoins(int n) {
		int count = 0;
		int row = 1;

		while (n >= row) {
			n -= row;
			row++;
			count++;
		}

		return count;
	}

	public static void main(String[] args) {
		// Question 5
		int n = 5;

		CoinArrangementQ5 solution = new CoinArrangementQ5();
		int completeRows = solution.arrangeCoins(n);

		System.out.println("Output: " + completeRows);

	}

}
