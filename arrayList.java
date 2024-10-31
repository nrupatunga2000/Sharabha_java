import java.util.*;
class students{
    String name;
    int rollNum;
    int marks;

}
public class arrayList {
    public static void main(String[] args) {
        students s1 = new students();
        s1.name = "Nrupatunga";
        s1.marks = 50;
        s1.rollNum = 21;

        students s2 = new students();
        s2.marks = 24;
        s2.name = "samy";
        s2.rollNum = 22;

        students s3 = new students();
        s2.marks = 36;
        s2.name = "Tanu";
        s3.rollNum = 20;

        students stud[] = new students[3];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;
    }
}
