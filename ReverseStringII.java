public class ReverseStringII {
    public static void main(String[] args) {
        String rev = reverseStr("abcdefg", 2);
        System.out.println("rev " + rev);
    }

    public static String reverseStr(String s, int k) {

        String temp = "";
        String finalStr = "";
        int couter = k;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 <= couter) {
                if (count % 2 == 0) {
                    temp = s.charAt(i) + temp;
                }
                if (i + 1 == couter) {
                    couter = 2 * k;
                    finalStr = finalStr + temp;
                    temp = "";
                    count++;
                }
                System.out.println("temp " + finalStr);
            }
        }
        return s;
    }
}
