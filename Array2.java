class Array2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 7, 0, 4};
        int[] arr1 = new int[arr.length];
        int j = 0; // index for arr1

        // First copy non-zero elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr1[j] = arr[i];
                j++;
            }
        }

        // Then copy zero elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr1[j] = arr[i];
                j++;
            }
        }

        // Print the new array
        for (int k = 0; k < arr1.length; k++) {
            System.out.println(arr1[k]);
        }
    }
}