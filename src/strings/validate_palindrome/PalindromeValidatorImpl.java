package strings.validate_palindrome;

import utils.constants.Constants;

import static utils.constants.Constants.DELTA_CAP_SML_LTR;

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

        char charHead = 0;
        char charTail = 0;
        while (head < tail) {

            // check head character
            do {
                charHead = alphanumericValidator(s.charAt(head));
                if (charHead != 0) {
                    break;
                }
                head++;
            } while (head < tail);

            // check tail character
            do {
                charTail = alphanumericValidator(s.charAt(tail));
                if (charTail != 0) {
                    break;
                }
                tail--;
            } while (tail > head);

            if (head < tail && charHead != charTail) {
                return false;
            }

            head++;
            tail--;
        }
        return true;
    }

    private char alphanumericValidator(char c) {
        // check if a number or a small letter
        if (((int) c >= (int) '0' && (int) c <= (int) '9') ||
                ((int) c >= (int) 'a' && (int) c < (int) 'z')) {
            return c;
        }

        // check if a capital letter then convert to small
        if ((int) c >= (int) 'A' && (int) c <= (int) 'Z') {
            return (char) ((int) c + DELTA_CAP_SML_LTR);
        }

        return 0;
    }
}
