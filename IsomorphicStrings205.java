import java.util.ArrayList;

/*
205. Isomorphic Strings
https://leetcode.com/problems/isomorphic-strings/submissions/913987862/
* approach:
* 1. traverse and store s chars and t chars in different arrs
* 2. find the mapping and validate if present
* */
public class IsomorphicStrings205 {
    public static void main(String[] args) {

        // boolean isomorphic = isIsomorphic("badc", "baba");//false
        boolean isomorphic = isIsomorphic("ACAB", "XCXY");
        System.out.println("isomorphic - " + isomorphic);
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }

        ArrayList<Character> sChars = new ArrayList<>();
        ArrayList<Character> tChars = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char sAt = s.charAt(i);
            char tAt = t.charAt(i);
            if ((sChars.contains(s.charAt(i)) && tChars.get(sChars.indexOf(sAt)) != tAt)
                    || (tChars.contains(tAt) && sChars.get(tChars.indexOf(tAt)) != sAt)) {
                return false;
            } else {
                sChars.add(sAt);
                tChars.add(tAt);
            }
        }
        return true;
    }
}
