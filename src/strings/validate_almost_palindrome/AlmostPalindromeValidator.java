package strings.validate_almost_palindrome;

// Given:
//      - a string
// Constrains:
//      - only compare alphanumeric characters
//      - ignore case sensitivity
// TODO - Required:
//      determine if string is almost a palindrome (by removing one character)
//      Ex: "abca" --> true ( become palindrome by removing 'c')
public interface AlmostPalindromeValidator {
    boolean isAlmostPalindromeV1(String str);
    boolean isAlmostPalindromeV2(String str);
}
