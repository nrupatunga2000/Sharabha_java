public class ArrOps1 {
    public static void main(String[] args) {
        int arr[] = {1,4,2,6,9,3,2};
        int arr1[] = new int [arr.length];
        int j=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr.length){
                arr1[j] = arr[i];
                System.out.println(arr1[arr.length]);
            }
        }

    }
}
