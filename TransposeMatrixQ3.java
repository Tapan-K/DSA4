package in.ineuron.assign4;

public class TransposeMatrixQ3 {
	public int[][] transpose(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		int[][] transposeMatrix = new int[cols][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transposeMatrix[j][i] = matrix[i][j];
			}
		}

		return transposeMatrix;
	}

	public static void main(String[] args) {
		// Question 3

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		TransposeMatrixQ3 solution = new TransposeMatrixQ3();
		int[][] transposeMatrix = solution.transpose(matrix);

		System.out.println("Output ---> : ");
		for (int[] row : transposeMatrix) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();

		}

	}
}
