import java.util.List;

public class LongName {
    

    public String longest(List<String> arr) {
        // code here
        if(arr==null|| arr.isEmpty()){
            return "";
        }
        String max = arr.get(0);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i).length()>max.length()){
                max = arr.get(i);
            }
        }
        return max;
    }
}


