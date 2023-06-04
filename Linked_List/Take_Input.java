package Linked_List;
import java.util.Scanner;
class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Take_Input{

    public static LinkedListNode<Integer> takeInput(){
        LinkedListNode<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int no_Nodes = s.nextInt();
        int i = 0;
        while(i < no_Nodes) {
            int data = s.nextInt();
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }
}


