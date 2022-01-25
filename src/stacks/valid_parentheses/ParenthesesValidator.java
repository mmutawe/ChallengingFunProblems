package stacks.valid_parentheses;

// Given:
//      String containing only parentheses,
// Constrains:
//      - String cant be null
//      - Empty string count as valid;
//      - 0 <= s.length <= 104
//      - s consists of parentheses only '()[]{}'
// TODO - Required:
//      determine if string is a valid (The string is valid of all parentheses are closed)
//      Ex: {([])} , res: true
public interface ParenthesesValidator {
    public boolean isValid(String text);
}
