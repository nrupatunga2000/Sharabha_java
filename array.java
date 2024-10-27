import java.util.*;

 class Calculator{
    int num1;
    int num2;

    public Calculator(){
        num1 = 20;
        num2 = 30;
    }

    public void crud(){
        int add = num1+num2;
        int sub = num1 - num2;
        System.out.println("added "+add + " minus " +sub);
    }
    public void cruds(){
        int multi = num1*num2;
        int div = num1/num2;
    }

 }

public class array {
public static void main(String[] args) {
    Calculator obj = new Calculator();
    System.out.println(obj.num1);
    obj.crud();
}
    
}