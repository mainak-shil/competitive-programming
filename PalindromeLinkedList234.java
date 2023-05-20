import LinkList.ListNode;

import java.util.Stack;

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode local=head;
        String originalStr = "";
        Stack<Integer> intStack = new Stack<>();
        while(local!=null){
            intStack.push(local.val);
            local = local.next;
        }
        System.out.println(intStack.peek());
        while(head!=null){
            if(intStack.pop()!=head.val){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}