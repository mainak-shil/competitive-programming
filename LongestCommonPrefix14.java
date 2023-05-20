import java.util.Objects;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        longestCommonPrefix(strs);
    }

    public static String longestCommonPrefix(String[] strs) {

        if(strs.length==1){
            return strs[0];
        }
        if(strs.length>1){
            String prevString = "";
            for (String str : strs) {
                if(Objects.equals(prevString, "")) {
                    prevString = str;
                    continue;
                }

                System.out.println(str+" "+prevString);
            }
        }
        return "";
    }
}
