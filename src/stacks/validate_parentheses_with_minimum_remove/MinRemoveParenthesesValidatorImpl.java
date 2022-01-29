package stacks.validate_parentheses_with_minimum_remove;

import java.util.Stack;

public class MinRemoveParenthesesValidatorImpl implements MinRemoveParenthesesValidator {

    // optimal solution
    // Space: O(n), Time: O(n)
    @Override
    public String validate(String s) {

        StringBuilder validStr = new StringBuilder(s);
        Stack<Integer> closedBracketIndices = new Stack<>();
        int textLength = s.length();

        for (int i = textLength - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '(' ){
                if (closedBracketIndices.isEmpty()) {
                    validStr.deleteCharAt(i);
                } else {
                    closedBracketIndices.pop();
                }
            }

            if (c == ')') {
                closedBracketIndices.push(i);
            }
        }

        if (!closedBracketIndices.isEmpty()){
            for(Integer index: closedBracketIndices){
                validStr.deleteCharAt(index);
            }
        }


        return validStr.toString();
    }
}
