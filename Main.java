/*from the given array add the zeros in the first place */

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,3,0,4,0,5};
        int[] arr1 = new int [arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr1[j]=0;
                j++;
            }
        }

            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    arr1[j]=arr[i];
                    j++;
                }
            }

        //     for(int i=0;i<arr.length;i++){
        //     if(arr[i]==0){
        //         arr1[j]=0;
        //         j++;
        //     }
        // }

            for(j=0;j<arr1.length;j++){
            System.out.println(arr1[j]);
                

            }
        }
    }
