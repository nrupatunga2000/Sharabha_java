import java.util.*;
//creating or making the normal class as a thread
class A extends Thread {
    public void show(){
       for(int i=0; i<=10;i++){
        System.out.println("Hi");
       }
    }
}

    class B extends Thread {
        public void show(){
           for(int i=0; i<=10;i++){
            System.out.println("Hello");
           }
        }
}   
public class threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj3 = new B();

        //you are starting threads
        obj1.start();
        obj3.start();
    }
}
