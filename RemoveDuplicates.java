import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Initialize the array with some duplicate values
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6};

        // Remove duplicates by converting the array to a Set
        Set<Integer> uniqueSet = new HashSet<>();

        // Add elements from the array to the Set
        for (int num : arr) {
            uniqueSet.add(num);
        }

        // Convert the Set back to an array
        int[] result = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            result[index++] = num;
        }

        // Output the array without duplicates
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}
