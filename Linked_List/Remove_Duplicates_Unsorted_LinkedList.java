package Linked_List;

import java.util.HashSet;

public class Remove_Duplicates_Unsorted_LinkedList {
   public static LinkedListNode<Integer> remove(LinkedListNode<Integer> head){
       LinkedListNode<Integer> curr = head;
       LinkedListNode<Integer> prev = null;
       HashSet<Integer> set = new HashSet<>();
       while (curr != null){
           if (set.contains(curr.data)) prev.next = curr.next;
           else {
               set.add(curr.data);
               prev = curr;
           }
           curr = curr.next;
       }
       return head;
   }

    public static void main(String[] args) {
       Print_LinkedList.print(remove(Take_Input.takeInput()));
    }
}
