/**
 * 67. Add Binary
 * https://leetcode.com/problems/add-binary/submissions/914655711/
 * Runtime 5 ms
 * need optimization
 */
public class AddBinary67 {
    static String sumS = "";

    public static void main(String[] args) {
//        String result = addBinary("11", "1");
        String result = addBinary("1010", "1011");
//        String result = addBinary("111", "111");
        System.out.println("result - " + sumS);
    }

    public static String addBinary(String a, String b) {
        return sumRecursion(a, b, false);
    }

    public static String sumRecursion(String a, String b, boolean carry) {

        if (a.length() != 0 || b.length() != 0) {
            String sum = sum(a.length() == 0 ? null : a.charAt(a.length() - 1), b.length() == 0 ? null : b.charAt(b.length() - 1), carry);
            carry = sum.length() == 2;
            sumS = sum.substring(sum.length() - 1) + sumS;

            if (a.length() != 0) {
                a = a.substring(0, a.length() - 1);
            }
            if (b.length() != 0) {
                b = b.substring(0, b.length() - 1);
            }
            if (a.length() == 0 && b.length() == 0) {

            } else {
                sumRecursion(a, b, carry);
            }
        }
        if (a.length() == 0 && b.length() == 0 && carry) {
            sumS = "1" + sumS;
        }
        return sumS;
    }

    public static String sum(Character a, Character b, boolean isCarry) {
        String sumS = "";
        int sum = a != null ? Integer.parseInt(String.valueOf(a)) : Integer.parseInt(String.valueOf(b));
        if (a != null && b != null) {
            sum = Integer.parseInt(String.valueOf(a)) + Integer.parseInt(String.valueOf(b));
        }
        if (sum == 2) {
            sumS = isCarry ? "11" : "10";
        } else if (sum == 1 && isCarry) {
            sumS = "10";
        } else if (sum == 1) {
            sumS = "1";
        } else {
            sumS = isCarry ? "1" : "0";
        }
        return sumS;
    }
}
