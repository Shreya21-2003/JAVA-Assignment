public class StringImmutability {
    public static void main(String[] args) {
        // Original string
        String str1 = "Hello";
        System.out.println("Original String: " + str1);

        // Attempting to modify the string
        str1.concat(" World");
        System.out.println("After concat operation: " + str1);

        // Correct way to modify a string
        String str2 = str1.concat(" World");
        System.out.println("New String after concat: " + str2);

        // Checking reference change
        System.out.println("Is str1 unchanged? " + (str1 == "Hello"));
        System.out.println("Is str2 a new object? " + (str2 == "Hello World"));
    }
}

