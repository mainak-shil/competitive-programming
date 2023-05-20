public class ValidPalindrome125 {
    public static void main(String[] args) {
        String inputStr = "A man, a plan, a canal: Panama";
//        String inputStr = "race a car";
        Boolean isPalindrome = isPalindrome(inputStr);
        System.out.println(isPalindrome);
    }

    private static Boolean isPalindrome(String inputStr) {
        inputStr = inputStr.trim();
        if(inputStr.equals("")){
            return true;
        }
        int i=0;
        int j = inputStr.length() -1;
        while(i<j){
            String lowerCasei = String.valueOf(inputStr.charAt(i)).toLowerCase();
            String lowerCasej = String.valueOf(inputStr.charAt(j)).toLowerCase();
            if(Character.isLetterOrDigit(lowerCasei.charAt(0))&&Character.isLetterOrDigit(lowerCasej.charAt(0))){
                if(lowerCasei.equals(lowerCasej)){
                    i++;
                    j--;
                }else {
                    return false;
                }
            }else{
                if(!Character.isLetterOrDigit(lowerCasei.charAt(0))){
                    i++;
                }
                if(!Character.isLetterOrDigit(lowerCasej.charAt(0))){
                    j--;
                }
            }
        }
        return true;
    }
}
//           if(c>65 90 97 122  48 57)
