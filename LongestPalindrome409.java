//409. Longest Palindrome
//https://leetcode.com/problems/longest-palindrome
/**
 * trick
 * created sorted distinct counted array of chars
 * init count with 0th position count; as it be always palindrome
 * if:
 * number is even   -> add exact
 * number is odd    -> count is odd -> remove one and take
 * -> count is even -> add exact
 */

import java.util.*;

public class LongestPalindrome409 {
    public static void main(String[] args) {
//        String givenString = "cdaaadc";
//        String givenString = "abccccdd";
        String givenString = "bananas";
        int count = longestPalindrome(givenString);
        System.out.println("final " + count);
    }

    public static int longestPalindrome(String s) {
        int count = 0;
        if (s.length() == 0) {
            return count;
        }
        ArrayList<Integer> arrayOfSortedCount = getArrayOfSortedCount(s);
        System.out.println(arrayOfSortedCount);
        count = arrayOfSortedCount.get(0);//init
        for (int i = 1; i < arrayOfSortedCount.size(); i++) {
            if (arrayOfSortedCount.get(i) % 2 == 0) {
                count += arrayOfSortedCount.get(i);
            } else {
                if (arrayOfSortedCount.get(i) > 1) {
                    if (count % 2 != 0) {//odd
                        count += arrayOfSortedCount.get(i) - 1;
                    } else {
                        count += arrayOfSortedCount.get(i);
                    }
                }
            }
        }
        return count;
    }

    public static HashMap storeCountHash(String givenString) {
        HashMap<Character, Integer> countMaps = new HashMap<>();
        for (int i = 0; i < givenString.length(); i++) {
            countMaps.put(givenString.charAt(i), countMaps.containsKey(givenString.charAt(i)) ? countMaps.get(givenString.charAt(i)) + 1 : 1);
        }
        return countMaps;
    }

    public static ArrayList<Integer> getArrayOfSortedCount(String givenString) {
        ArrayList<Integer> arrayI = new ArrayList<>();
        arrayI.addAll(storeCountHash(givenString).values());
        arrayI.sort(Comparator.naturalOrder());
        return arrayI;
    }
}

