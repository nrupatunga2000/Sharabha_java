import java.util.*;
public class arrlist {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        
        cars.add("BMW");
        cars.add("benz");
        cars.add(0,"audi");
        cars.set(1, "Tesla");
        cars.remove(0);
        System.out.println(cars);

        
    }
}
