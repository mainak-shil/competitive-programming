package LinkList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListCycle141 {
    static ListNode head; // head of list

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(1);
        integers.add(2);
        // make it by scanner
//        [1,2,1,2]
        AddItemsInNode addItemsInNode = new AddItemsInNode(integers);
        ListNode listNode = addItemsInNode.getListNode();
        boolean b = hasCycle(listNode);
        System.out.println("hascycle? "+b);
//        while(listNode!=null){
//            System.out.println(listNode.val);
//            listNode = listNode.next;
//        }
    }

//    static public void push(int new_data)
//    {
//        /* 1 & 2: Allocate the Node &
//                  Put in the data*/
//        ListNode new_node = new ListNode(new_data);
//
//        /* 3. Make next of new Node as head */
//        new_node.next = head;
//
//        /* 4. Move the head to point to new Node */
//        head = new_node;
//    }


    public static boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
