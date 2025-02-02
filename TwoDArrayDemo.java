public class TwoDArrayDemo {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Loop through the rows
        System.out.println("Elements of the 2D array:");
        for (int i = 0; i < arr.length; i++) {
            // Loop through the columns
            for (int j = 0; j < arr[i].length; j++) {
                // Print each element
                System.out.print(arr[i][j] + " ");
            }
            // Move to the next line after printing one row
            System.out.println();
        }
    }
}
