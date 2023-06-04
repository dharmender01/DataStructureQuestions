package Linked_List;

public class Delete_Without_HeadNode {
    public  static void delete_Node_without_head(LinkedListNode<Integer> head){
        LinkedListNode<Integer> curr = head.next;
        head.data = curr.data;;
        head.next = curr.next;
    }
    public static void main(String[] args) {
        LinkedListNode<Integer> head = Take_Input.takeInput(); //input of linked list
        delete_Node_without_head(head.next); //head.next --> node to be deleted
        Print_LinkedList.print(head);
    }
}
