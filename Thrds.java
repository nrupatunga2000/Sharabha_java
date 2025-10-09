/*threads implementation  */
import java.util.*;

//creating a class called my Thrds and extending the thread class
class MyThrds extends Thread {
    public void run(){
        System.out.println("the thread is running");
    }
}

public class Thrds {
    public static void main(String[] args) {
        MyThrds t1 = new MyThrds();
        t1.start(); //starting the thread
        
    }
}
