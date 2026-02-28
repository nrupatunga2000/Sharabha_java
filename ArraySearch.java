public class ArraySearch {

    int search(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;  // return index of first occurrence
            }
        }
        return -1;  // element not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int x = 3;

        ArraySearch arraySearch = new ArraySearch();
        int result = arraySearch.search(arr, n, x);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}