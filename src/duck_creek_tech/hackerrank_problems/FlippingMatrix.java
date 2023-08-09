package duck_creek_tech.hackerrank_problems;
import java.util.List;

public class FlippingMatrix {

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int n = matrix.size() / 2;
        int maxSum = 0;

        // Iterate over the top-left quadrant of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Find the maximum value that can be placed in position (i, j)
                int maxValue = Math.max(
                        Math.max(matrix.get(i).get(j), matrix.get(i).get(2 * n - 1 - j)),
                        Math.max(matrix.get(2 * n - 1 - i).get(j), matrix.get(2 * n - 1 - i).get(2 * n - 1 - j))
                );

                // Add the maximum value to the sum
                maxSum += maxValue;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        // Example test case
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );

        System.out.println("Maximal sum in top-left quadrant: " + flippingMatrix(matrix)); // Output: 4
    }
}

