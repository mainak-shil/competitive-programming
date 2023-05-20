import LinkList.ListNode;

import java.util.Stack;
/*
 *392. Is Subsequence
 * https://leetcode.com/problems/is-subsequence/submissions/913993802/
 * */
class IsSubsequence392 {

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
    static Stack<Character> characterStack;

    public static void main(String[] args) {
        String matcher = "axc";
        String text = "ahbgdc";

        Boolean isValid = isSubsequence(matcher, text);
        System.out.println("isValid --> " + isValid);

    }

    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        convertToStack(s);
        if (s.length() > t.length()) {
            return false;
        }
        for (int i = 0; i < t.length(); i++) {
            if (characterStack.size() > t.length() - i) {
                return false;
            }
            if (t.charAt(i) == characterStack.peek()) {
                popStack();
                if (characterStack.size() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void convertToStack(String matcher) {
        if (matcher.length() == 0) {
            return;
        }
        characterStack = new Stack<>();
        for (int i = matcher.length() - 1; i >= 0; i--) {
            characterStack.push((matcher.charAt(i)));
        }
    }

    public static void popStack() {
        if (characterStack.size() == 0) {
            return;
        }
        characterStack.pop();
    }

    public static boolean isSubsequenceBestAns(String s, String t) {
        // 1 ms beat 100
        int i = 0, j = 0;
        int n = t.length();
        int m = s.length();
        char ss[] = s.toCharArray();
        char tt[] = t.toCharArray();

        if (m < 1)
            return true;

        while (i < n) {
            if (tt[i] == ss[j]) {
                j++;
            }
            i++;

            if (j == m)
                return true;
        }

        return false;
    }
}