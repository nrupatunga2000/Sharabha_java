import java.util.*;

class Node{
    int data;
    Node next;
}



public class LinkedListdemo {
    public static void main(String[] args) {
        Node box1 = new Node();
        Node box2 = new Node();
        Node box3 = new Node();

        //fill the boxes with the data
        box1.data = 10;
        box2.data = 20;
        box3.data = 30;

        //cnnect the bxes now 
        box1.next = box2;
        box2.next = box3;
        box3.next = null;

        //let me print the linked list
        Node current = box1;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
    }
}
