package strings.validate_palindrome;

public class PalindromeValidatorImpl implements PalindromeValidator {

    // Brute fprce solution
    // Time: O(n), Space: n
    @Override
    public boolean isPalindromeV1(String str) {
        String strAlphaNum = str
                .replaceAll("[^A-Za-z0-9]", "")
                .toLowerCase();

        for (int i = 0; i < strAlphaNum.length(); i++) {
            if (strAlphaNum.charAt(i) != strAlphaNum.charAt(strAlphaNum.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Optimal solution
    // Time: O(n), Space: 1
    @Override
    public boolean isPalindromeV2(String s) {

        int head = 0;
        int tail = s.length() - 1;

        char charHead = ' ';
        char charTail = ' ';
        while (head < tail) {

            while (head < tail) {
                charHead = alphanumericValidator(s.charAt(head));
                if (charHead != '!') {
                    break;
                }
                head++;
            }
            while (tail > head) {
                charTail = alphanumericValidator(s.charAt(tail));
                if (charTail != '!') {
                    break;
                }
                tail--;
            }

            if (head < tail && charHead != charTail) {
                return false;
            }

            head++;
            tail--;
        }
        return true;
    }

    private char alphanumericValidator(char c) {

        // is a number or a small letter
        if (((int) c > 47 && (int) c < 58) ||
                ((int) c > 96 && (int) c < 123)) {
            return c;
        }

        // is a number or a small letter
        if ((int) c > 64 && (int) c < 91) {
            return (char) ((int) c + 32);
        }

        return '!';
    }
}
