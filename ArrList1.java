/*adding the zero at the starting of the list */

import java.util.ArrayList;
import java.util.Arrays;

public class ArrList1 {
    public static void main(String[] args) {
        ArrayList<Integer> chandu = new ArrayList<>(Arrays.asList(1,0,2,5,0,7));
        ArrayList<Integer> zero = new ArrayList<>();

        for(int i=0;i<chandu.size();i++){
            if(chandu.get(i)==0){
                // chandu.remove(i);
                zero.add(0);
            }  
        }
        for(int i=0;i<chandu.size();i++){
            if(chandu.get(i)!=0){
                zero.add(chandu.get(i));
            }
        }
        
        System.out.println(zero);
    }
}
