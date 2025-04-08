public class Main {
    public static void main(String[] args) {
        // Create an array of numbers
        int[] numbers = {5, 10, 15, 20, 30};

        // Initialize the maximum value as the first element
        int max = numbers[0];

        // Loop through the array to find the maximum value
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print the maximum value
        System.out.println("The maximum value is: " + max);
    }
}
