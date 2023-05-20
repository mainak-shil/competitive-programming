//import java.util.ArrayList;
//import java.util.Stack;
//
//class HelloWorld {
//    public static void main(String[] args) {
//        // System.out.println("Hello, World!");
//        Boolean isValid = isValid("(){");
//        System.out.println(isValid);
//    }
//
//    public static boolean isValid(String ss) {
//        // String s = "{[]}";
//
//        String s = "([]";
//        if (s.length() == 1) {
//            return false;
//        }
//        boolean isTotalTrue = false;
//        String openBrackets = "({[";
//        String closedBrackets = ")}]";
//        ArrayList<String> scripts = new ArrayList<String>();
//        Stack<Character> charStack = new Stack<>();
//        while (!s.equals("")) {
//            boolean charContainsInOpenB = openBrackets.contains(String.valueOf(s.charAt(0)));
//            if (scripts.size() == 0) {
//                if (closedBrackets.contains(String.valueOf(s.charAt(0)))) {
//                    // if 1st index is closed one, return false
//                    return false;
//                }
//                if (s.length() == 1 && charContainsInOpenB) {
//                    // only one element and from openBrackets, exit as no one to check
//                    return false;
//                }
//                scripts.add(String.valueOf(s.charAt(0)));
//            } else {
//                // if again open - add
//                if (charContainsInOpenB) {
//                    scripts.add(String.valueOf(s.charAt(0)));
//                } else {
//                    // if closed match (arr last open element, char closed element)
//                    // if matched ; pop LIFO
//                    // not matched; exit as already failed
//                    boolean isMatched = matcher(scripts.get(scripts.size() - 1).charAt(0), s.charAt(0));
//                    if (isMatched) {
//                        scripts.remove(scripts.size() - 1);
//                        isTotalTrue = true;
//                    } else {
//                        return false;
//                    }
//                }
//
//            }
//            s = s.length() != 1 ? s.substring(1) : "";
//            if (s.equals("") && scripts.size() !=0){
//                return false;
//            }
//        }
//        return isTotalTrue;
//    }
//
//    public static boolean matcher(char open, char close) {
//        if (open == '(' && close == ')') return true;
//        if (open == '{' && close == '}') return true;
//        if (open == '[' && close == ']') return true;
//        return false;
//    }
//}



import java.util.ArrayList;
//import java.util.Stack;
//
//class HelloWorld {
//    public static void main(String[] args) {
//        // System.out.println("Hello, World!");
//        Boolean isValid = isValid("(){}");
//        System.out.println(isValid);
//    }
//
//    public static boolean isValid(String s) {
//        if (s.length() == 1) {
//            return false;
//        }
//        Stack<Character> characterStack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char charNow = s.charAt(i);
//            if (charNow == '(' || charNow == '{' || charNow == '[') {
//                characterStack.push(charNow);
//            } else {
//                if(!characterStack.empty()){
//                    boolean matcher = matcher(characterStack.pop(), charNow);
//                    if(!matcher){
//                        return false;
//                    }
//                }
//                return false;
//            }
//
//        }
//        return true;
//    }
//
//    public static boolean matcher(char open, char close) {
//        if (open == '(' && close == ')') return true;
//        if (open == '{' && close == '}') return true;
//        if (open == '[' && close == ']') return true;
//        return false;
//    }
//}