import java.util.*;

class addition{
    public int adding(int a, int b, int c){
        return a+b+c;
    }

    public double adding(int a, int b){
        return a*b;
    }
}
public class methOverloading {
    public static void main(String[] args) {
       addition obj = new addition();
       int sum=obj.adding(12, 30, 10);
       System.out.println(sum);
       
       double sum1 = obj.adding(1, 3);
       System.out.println(sum1);

       
    }
}
