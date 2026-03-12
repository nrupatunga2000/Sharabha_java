import java.util.ArrayList;

public class ZeroEnd {
     public static void main(String[] args) {
        int[] arr = {-1,0,4,2,0,-3,0,-8};
        ArrayList<Integer> list = new ArrayList<>();
        for(int n: arr){
            list.add(n);
        }
        System.out.println(list);
        int count =0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==0){
                list.remove(i);
                 count ++;
            }
        }
        for(int j=count;j>0;j--){
            list.add(0);
        }
        System.out.println(list);
        
    }
}
