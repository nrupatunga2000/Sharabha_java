import java.util.HashSet;

public class DistElementSum {
    int findSum(int arr[]) {
        // code here
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr){
            set.add(i);
        }
        for(int i: set){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        DistElementSum obj = new DistElementSum();
        int arr[] = {1, 2, 2, 3, 4, 4, 5};
        System.out.println(obj.findSum(arr));   
    }
}
