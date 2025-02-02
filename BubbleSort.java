public class BubbleSort {
    // Method to perform Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(arr);

        // Perform Bubble Sort
        bubbleSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
