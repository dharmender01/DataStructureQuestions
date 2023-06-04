package Linked_List;

public class Merge_Sorted_List {
    public static LinkedListNode<Integer> merge(LinkedListNode<Integer> list1, LinkedListNode<Integer> list2){
        LinkedListNode<Integer> temp = new LinkedListNode<>(-1);
        LinkedListNode<Integer> newHead = temp;
        while(list1 != null && list2 != null){
            if(list1.data < list2.data){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1 != null) temp.next = list1;
        if(list2 != null) temp.next = list2;
        return newHead.next;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> list1 = Take_Input.takeInput();
        LinkedListNode<Integer> list2 = Take_Input.takeInput();
        LinkedListNode<Integer> head = merge(list1,list2);
        Print_LinkedList.print(head);
    }
}
