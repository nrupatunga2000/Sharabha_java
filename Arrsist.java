/*adding the zeros at the end of the list when those lists are inbetween the list elements */

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;

public class Arrsist {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,3,5,0,8,0,9));
        ArrayList<Integer> zeros = new ArrayList<>();
        for (int i=nums.size()-1;i>=0;i--){
            if(nums.get(i)==0){
                nums.remove(i);
                zeros.add(0);   
            }
                       
        }
            nums.addAll(zeros);

            System.out.println(nums);
        

        
    }
}
