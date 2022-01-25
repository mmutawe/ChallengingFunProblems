package stacks.valid_parentheses;

// Given:
//      String containing only parentheses,
// Constrains:
//      - Empty string count as valid;
//      - 1 <= s.length <= 104
//      - s consists of parentheses only '()[]{}'
// TODO - Required:
//      determine if string is a valid (The string is valid of all parentheses are closed)
//      Ex: {([])} , res: true
public interface ParenthesesValidator {
    public boolean isValid(String text);
}
