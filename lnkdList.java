import java.util.*;
public class lnkdList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("BMW");
        cars.add("Suzuki");
        cars.add("Benz");
        System.out.println(cars);
        
        cars.addFirst("Audi");
        cars.addLast("Bently");
        System.out.println(cars);

        cars.removeFirst();
        cars.removeLast();
        System.out.println(cars);

        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        

    }
}
