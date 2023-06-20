package InterviewPractise;

import java.util.Stack;

public class Solve {


    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (isOpeningParanthesis(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty()) {

                Character closing = s.charAt(i);
                Character maybeOpening = stack.peek();

                if (elmenentsMatch(maybeOpening, closing)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        if (stack.isEmpty())
            return true;
        return false;
    }

    private boolean elmenentsMatch(Character maybeOpening, Character closing) {

        if (!isOpeningParanthesis(maybeOpening)) {
            return false;
        }
        String combined = String.valueOf(maybeOpening + closing);

        return combined.equals("{}") || combined.equals("[]") || combined.equals("()");
    }

    private boolean isOpeningParanthesis(char c) {
        if (c == '(' || c == '{' || c == '[') {
            return true;
        }
        return false;
    }
}
