import java.util.*;

 class Student{
    int roolno;
    String name;
    int marks;

    @Override
    public String toString(){
        return " "+ roolno +" " + name +" " + marks;
    }
 }
   
public class Innerarray {
public static void main(String[] args) {
    Student obj = new Student();
    obj.roolno = 21;
    obj.name = "Nrupatunga";
    obj.marks = 35;

    Student obj1 = new Student();
    obj1.roolno = 25;
    obj1.name = "Hajam";
    obj1.marks = 15;

    Student obj2 = new Student();
    obj2.roolno = 28;
    obj2.name = "Nizam";
    obj2.marks = 25;

    Student students[] = new Student[3];
    students[0] = obj;
    students[1] = obj1;
    students[2] = obj2;

    System.out.println(students[1]);
}
    
}