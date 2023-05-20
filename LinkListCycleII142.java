import LinkList.ListNode;

public class LinkListCycleII142 {
  public ListNode detectCycle(ListNode head) {
    ListNode headNew = head;
    while (headNew.next != null) {
      while (headNew.next.next != null) {
        if (headNew.next == headNew.next.next) {
          System.out.println("ss");
          return headNew.next;
        }
        headNew.next = headNew.next.next;
      }
      System.out.println(headNew.val);
      headNew = headNew.next;
    }

    return null;
  }
}