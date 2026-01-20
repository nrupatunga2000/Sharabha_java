import java.util.*;
public class NameSort {
    public static String name(String s){
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        s = new String(ch);
        return s;
    }
    public static void main(String[] args) {
        String s = "Nrupatunga";
        System.out.println(name(s));
    }
}
