import java.util.Stack;

public class Main {
    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        String opening = "([{";
        String closing = ")]}";
        for (char c : s.toCharArray()) {
            if (opening.indexOf(c) != -1) {
                stack.push(c);
            } else if (closing.indexOf(c) != -1) {
                if (stack.isEmpty() || opening.indexOf(stack.pop()) != closing.indexOf(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValidParentheses("()"));
        System.out.println(isValidParentheses(")()())"));
        System.out.println(isValidParentheses("("));
        System.out.println(isValidParentheses("(())((()())())"));
        System.out.println(isValidParentheses("{[()]}"));
        System.out.println(isValidParentheses("{}[]()"));
    }
}