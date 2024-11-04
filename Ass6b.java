public class Ass6b {
    public static void main(String[] args) {
        // Sorted arrays P and Q
        int[] P = {1, 3, 5, 7, 9, 11}; // 6 sorted elements
        int[] Q = {2, 4, 6, 8};        // 4 sorted elements

        // Resultant array R of size equal to the sum of sizes of P and Q
        int[] R = new int[P.length + Q.length];

        // Merging process
        int i = 0, j = 0, k = 0;

        while (i < P.length && j < Q.length) {
            if (P[i] <= Q[j]) {
                R[k++] = P[i++];
            } else {
                R[k++] = Q[j++];
            }
        }

        // Copy remaining elements from P, if any
        while (i < P.length) {
            R[k++] = P[i++];
        }

        // Copy remaining elements from Q, if any
        while (j < Q.length) {
            R[k++] = Q[j++];
        }

        // Display the resultant array R
        System.out.print("Merged sorted array R: ");
        for (int element : R) {
            System.out.print(element + " ");
        }
    }
}
