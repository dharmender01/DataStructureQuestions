package Linked_List;

public class Reverse_List_Recursive {
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
        if(head == null) return head;
        if(head.next == null) return head;
        LinkedListNode<Integer> newNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
    public static void main(String[] args) {
      LinkedListNode<Integer> head = Take_Input.takeInput();
      Print_LinkedList.print(reverse(head));
    }
}

