package Linked_List;

public class Linked_List_Cycle {
    public  static boolean hasCycle(LinkedListNode<Integer> head) {
        if(head == null) return false;
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;

        }
        return false;
    }

}
