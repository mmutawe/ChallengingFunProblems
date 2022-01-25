package stacks.valid_parentheses;

import java.util.Stack;

public class ParenthesesValidatorImpl implements ParenthesesValidator {

    // optimal solution
    // Space: O(n), Time: O(n)
    @Override
    public boolean isValid(String text) {
        Stack<Character> stack = new Stack<>();
        for (char c: text.toCharArray()){
            // check for open parentheses
            if(c == '[' || c == '(' || c == '{'){
                stack.push(c);
            } else {
            // check for closed parentheses
                if(stack.isEmpty()){
                    return false;
                }
                char tmp = stack.pop();
                switch (c){
                    case ']':
                        if (tmp != '[') return false;
                        break;
                    case ')':
                        if (tmp != '(') return false;
                        break;
                    case '}':
                        if (tmp != '{') return false;
                        break;
                }
            }
        }

        if (!stack.isEmpty()){
            return false;
        }

        return true;
    }
}
