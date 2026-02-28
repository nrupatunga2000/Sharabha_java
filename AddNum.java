public class AddNum {
    // Method to calculate sum of array elements
    public static long get_Sum(int n, int[] input) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += input[i];
        }
        return sum;
    }

    // Method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int sum = addNumbers(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Example usage of get_Sum
        int[] arr = {6, 2, 5, 4, 5, 1, 6};
        System.out.println("Array sum: " + get_Sum(arr.length, arr)); // Output: 29
    }
}