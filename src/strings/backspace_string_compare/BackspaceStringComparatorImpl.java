package strings.backspace_string_compare;

public class BackspaceStringComparatorImpl implements BackspaceStringComparator {

    // *** Brute Force Solution ***
    // Space: O(n) , Time: O(n)
    @Override
    public boolean backspaceCompareV1(String text1, String text2) {

        int hashCounter = 0;
        String typedText1="";
        for (int i = text1.length() - 1; i >= 0; i--) {
            if (text1.charAt(i) == '#') {
                hashCounter++;
                continue;
            }

            if (hashCounter == 0) {
                typedText1 = text1.charAt(i) + typedText1;

            } else {
                hashCounter--;
            }
        }

        hashCounter=0;
        String typedText2="";
        for (int i = text2.length() - 1; i >= 0; i--) {
            if (text2.charAt(i) == '#') {
                hashCounter++;
                continue;
            }

            if (hashCounter == 0) {
                typedText2 = text2.charAt(i) + typedText2;

            } else {
                hashCounter--;
            }
        }

        if (typedText1.equals(typedText2)){
            return true;
        }
        return false;
    }

    public boolean backspaceCompareV2(String text1, String text2) {

        int maxIndex = Math.max(text1.length(), text2.length()) - 1;
        for (int i = maxIndex; i >= 0; i--) {

//            char charLocatorT1;
        }
        return true;
    }
}
