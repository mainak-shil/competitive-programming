package LinkList;

import java.util.ArrayList;

public class AddItemsInNode {
     ListNode listNode= null;
    AddItemsInNode(ArrayList<Integer> array){
        ListNode listNodeCopyHead = listNode;

        for (int i = 0; i < array.size(); i++) {
            if(listNodeCopyHead==null){
            ListNode listNodeCopy = new ListNode(array.get(i));
                listNode=listNodeCopy;
                listNodeCopyHead = listNodeCopy;
            }else{
                System.out.println(listNodeCopyHead);
                listNodeCopyHead.next = new ListNode(array.get(i));
                listNodeCopyHead = listNodeCopyHead.next;
            }
        }
    }

     ListNode getListNode(){
        return listNode;
    }
}
