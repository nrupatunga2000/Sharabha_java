/*find the missing number from the given array */

public class Farray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};

        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]!=1){
                System.out.println("missing number is" + (arr[i]+1));
                break;
            }
        }
    }
}
 