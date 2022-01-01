package strings.validate_almost_palindrome;

import static utils.constants.Constants.DELTA_CAP_SML_LTR;

public class AlmostPalindromeValidatorImpl implements AlmostPalindromeValidator {

    // Brute force solution
    // Time: O(n), Space: n
    @Override
    public boolean isAlmostPalindromeV1(String str) {
        String strAlphaNum = str
                .replaceAll("[^A-Za-z0-9]", "")
                .toLowerCase();

        boolean hasMismatch = false;
        boolean rightShiftMismatch = false;
        boolean leftShiftMismatch = false;
        int mismatchIndex = 0;

        for (int i = 0; i < strAlphaNum.length() / 2; i++) {
            if (!hasMismatch && strAlphaNum.charAt(i) != strAlphaNum.charAt(strAlphaNum.length() - 1 - i)) {
                hasMismatch = true;
                mismatchIndex = i;
            }

            if (hasMismatch) {
                if (!rightShiftMismatch && strAlphaNum.charAt(i + 1) != strAlphaNum.charAt(strAlphaNum.length() - 1 - i)) {
                    rightShiftMismatch = true;
                }

                if (!leftShiftMismatch && strAlphaNum.charAt(i) != strAlphaNum.charAt(strAlphaNum.length() - 2 - i)) {
                    leftShiftMismatch = true;
                }

                if (rightShiftMismatch && leftShiftMismatch) {
                    return false;
                }
            }
        }
        return true;
    }

    // Optimal solution
    // Time: O(n), Space: 1
    @Override
    public boolean isAlmostPalindromeV2(String s) {

        int head = 0;
        int tail = s.length() - 1;

        char charHead = 0;
        char charTail = 0;
        char prevCharHead = 0;
        char prevCharTail = 0;

        boolean hasMismatch = false;
        boolean mismatchShiftRight = false;
        boolean mismatchShiftLeft = false;

        while (head <= tail) {

            // store prev head and tail value if there is mismatch
            if (hasMismatch) {
                prevCharHead = charHead;
                prevCharTail = charTail;
            }

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

            if (!hasMismatch && head < tail && charHead != charTail) {
                hasMismatch = true;
                head++;
                tail--;
                continue;
            }

            if (hasMismatch && head <= tail) {
                if (!mismatchShiftRight && charHead != prevCharTail) {
                    mismatchShiftRight = true;
                }
                if (!mismatchShiftLeft && prevCharHead != charTail) {
                    mismatchShiftLeft = true;
                }
                if (mismatchShiftRight && mismatchShiftLeft) {
                    return false;
                }
            }
            head++;
            tail--;
        }
        return true;
    }

    private char alphanumericValidator(char c) {
        // check if a number or a small letter
        if (((int) c >= (int) '0' && (int) c <= (int) '9') ||
                ((int) c >= (int) 'a' && (int) c <= (int) 'z')) {
            return c;
        }

        // check if a capital letter then convert to small
        if ((int) c >= (int) 'A' && (int) c <= (int) 'Z') {
            return (char) ((int) c + DELTA_CAP_SML_LTR);
        }

        return 0;
    }
}
