public class BinarySearch {
    // Method to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        // Loop until the target is found or the range is invalid
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate middle index

            // Check if the target is at the middle
            if (arr[mid] == target) {
                return mid; // Return the index if found
            }

            // If the target is smaller than the middle, search in the left half
            if (arr[mid] > target) {
                right = mid - 1;
            }
            // If the target is larger than the middle, search in the right half
            else {
                left = mid + 1;
            }
        }

        // Return -1 if the target is not found
        return -1;
    }

    public static void main(String[] args) {
        // Sorted array
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        // Target element to search
        int target = 7;

        // Perform binary search
        int result = binarySearch(arr, target);

        // Output the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element " + target + " is at index: " + result);
        }
    }
}
