import java.util.ArrayList;
import java.util.Arrays;

public class ListEnd {
    public void insertAtEnd(ArrayList<Integer> arr) {
        // code here
        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum = sum+ arr.get(i);
        }
        arr.add(sum); 
    }
    public static void main(String[] args) {
        ListEnd l1 = new ListEnd();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        l1.insertAtEnd(arr); 
        System.out.println(arr);    

    }
}
