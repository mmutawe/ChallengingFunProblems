package strings.validate_almost_palindrome;

public class AlmostPalindromeValidatorImpl implements AlmostPalindromeValidator {

    // Brute force solution
    // Time: O(n), Space: n
    @Override
    public boolean isAlmostPalindromeV1(String str) {
        String strAlphaNum = str
                .replaceAll("[^A-Za-z0-9]", "")
                .toLowerCase();

        boolean hasMismatch = false;
        boolean shiftRightOnMismatch = true;
        int mismatchIndex = 0;

        for (int i = 0; i < strAlphaNum.length()/ 2; i++) {
            if (!hasMismatch && strAlphaNum.charAt(i) != strAlphaNum.charAt(strAlphaNum.length() - 1 - i)) {
                System.out.println("$$$ " + i);
                hasMismatch = true;
                mismatchIndex = i;
            }

            if (hasMismatch) {
                if (shiftRightOnMismatch) {
                    System.out.println((i+1) + " *** " + strAlphaNum.charAt(i + 1) + " *** " + strAlphaNum.charAt(strAlphaNum.length() - 1 - i) );
                    if (strAlphaNum.charAt(i + 1) != strAlphaNum.charAt(strAlphaNum.length() - 1 - i)) {
                        i = mismatchIndex - 1;
                        shiftRightOnMismatch = false;
                    }
                } else {
                    System.out.println(i +" ### " + strAlphaNum.charAt(i) + " ### " + strAlphaNum.charAt(strAlphaNum.length() - 2 - i) );

                    if (strAlphaNum.charAt(i) != strAlphaNum.charAt(strAlphaNum.length() - 2 - i)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
