import java.util.ArrayList;
import java.util.HashSet;

public class Duplicate {
    class Solution {

    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr){
            set.add(num);
        }
        return new ArrayList<>(set);
    }
}
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        ArrayList<Integer> uniqueElements = Solution.removeDuplicate(arr);
        System.out.println(uniqueElements);
    }
}
