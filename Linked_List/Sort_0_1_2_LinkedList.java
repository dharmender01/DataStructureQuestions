package Linked_List;

public class Sort_0_1_2_LinkedList {
    public static LinkedListNode<Integer> sort(LinkedListNode<Integer> head){
        if(head == null) return null;
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> temp1 = head;
        int count_0 = 0;
        int count_1 = 0;
        while(temp != null){
            if(temp.data == 0)count_0++;
            if(temp.data == 1)count_1++;
            temp = temp.next;
        }
        int i = 0;
        while(temp1 != null ){
            if(i< count_0) temp1.data = 0;
            else if(i>count_1+1) temp1.data = 2;
            else temp1.data = 1;
            temp1 = temp1.next;
            i++;
        }
        return head;
    }
    public static void main(String[] args) {
        LinkedListNode<Integer> head = Take_Input.takeInput();
        head  = sort(head);
        Print_LinkedList.print(head);
    }
}
