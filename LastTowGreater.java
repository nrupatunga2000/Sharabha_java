import java.util.Arrays;

public class LastTowGreater {
    public long[] findElements(long arr[]) {
        // Your code goes here
        long[] arr1 = new long[arr.length - 2];
        Arrays.sort(arr);
        
        for(int j=0;j<arr.length-2;j++){
            arr1[j] = arr[j];
        }
        return arr1;
    }
    public static void main(String[] args) {
        LastTowGreater obj = new LastTowGreater();
        long arr[] = {2, 4, 1, 5, 0};
        long[] result = obj.findElements(arr);
        System.out.println(Arrays.toString(result));
    }
}
