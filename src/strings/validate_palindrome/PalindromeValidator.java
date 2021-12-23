package strings.validate_palindrome;

// Given:
//      - a string
// Constrains:
//      - only compare alphanumeric characters
//      - ignore case sensitivity
// TODO - Required:
//      determine if string is palindrome
//      Ex: "aba" --> true ( reading string from left to right =  reading string from right to left)
public interface PalindromeValidator {
    boolean isPalindrome(String str);
}
