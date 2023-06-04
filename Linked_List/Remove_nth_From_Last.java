package Linked_List;

public class Remove_nth_From_Last {

    public static LinkedListNode<Integer> remove(LinkedListNode<Integer> head, int n){
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
       int i = 0;
        while(i<n){
            fast = fast.next;
            i++;
        }
        while (fast != null && fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        if(fast == null) return slow.next;
        slow.next = slow.next.next;
        return head;

    }
    public static void main(String[] args) {
        Print_LinkedList.print(remove(Take_Input.takeInput(),1));
    }
}
