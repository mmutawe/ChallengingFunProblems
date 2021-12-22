package strings.backspace_string_compare;

public class BackspaceStringComparatorImpl implements BackspaceStringComparator {

    // *** Brute Force Solution ***
    // Space: O(n) , Time: O(n)
    @Override
    public boolean backspaceCompareV1(String text1, String text2) {

        int hashCounter = 0;
        String typedText1 = "";
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

        hashCounter = 0;
        String typedText2 = "";
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

        if (typedText1.equals(typedText2)) {
            return true;
        }
        return false;
    }

    // *** Optimal Solution ***
    // Space: O(1) , Time: O(n)
    public boolean backspaceCompareV2(String text1, String text2) {

        int indexT1 = text1.length() - 1;
        int indexT2 = text2.length() - 1;
        int hashCounterText1 = 0;
        int hashCounterText2 = 0;
        boolean readyToCompare = false;

        while (indexT1 >= 0 || indexT2 >= 0) {


            if (indexT1 < 0) {
                if (hashCounterText2 == 0 & text2.charAt(indexT2) !='#'){
                    return false;
                }
            }
            else if (text1.charAt(indexT1) == '#') {
                hashCounterText1++;
                indexT1--;

            } else if (hashCounterText1 != 0) {
                hashCounterText1--;
                indexT1--;

            } else if (!readyToCompare) {
                readyToCompare = true;
            }

            if (indexT2 < 0) {
                if (readyToCompare) {
                    return false;
                }
            } else if (text2.charAt(indexT2) == '#') {
                hashCounterText2++;
                indexT2--;
            } else if (hashCounterText2 != 0) {
                hashCounterText2--;
                indexT2--;
            } else if (readyToCompare) {
                if (text1.charAt(indexT1) != text2.charAt(indexT2)) {
                    return false;
                }
                readyToCompare = false;
                indexT1--;
                indexT2--;
            }
        }

        return true;
    }
}
