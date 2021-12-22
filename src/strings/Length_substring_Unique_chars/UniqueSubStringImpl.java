package strings.Length_substring_Unique_chars;

public class UniqueSubStringImpl implements UniqueSubString {

    // Space: k , Time: O(n * k) - where k is the length of substr
    @Override
    public int lengthOfLongestSubstringV1(String str) {
        StringBuilder subStr = new StringBuilder();
        int maxSubstrLength = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < subStr.length(); j++) {
                if (str.charAt(i) == subStr.charAt(j)) {
                    subStr = subStr.delete(0, j + 1);
                    break;
                }
            }
            subStr.append(str.charAt(i));

            if (subStr.length() > maxSubstrLength) {
                maxSubstrLength = subStr.length();
            }
        }

        return maxSubstrLength;
    }

    // Sliding window technique
    // Space: n, Time: n
    @Override
    public int lengthOfLongestSubstringV2(String str) {

        if (str.length() < 2) {
            return str.length();
        }

        final int ASCII_SML_A_VALUE = 97;

        int headPointer = 0;
        int tailPointer = 0;
        int maxSubstrLength = 0;
        int[] lettersIndicesHashTable = initializeCharsHashTable();

        while (tailPointer < str.length()) {
            // get the ascii value of the tracked char within the string
            int charValue = (int) str.charAt(tailPointer);

            // shift it by -97.
            charValue -=ASCII_SML_A_VALUE;

            // check if an index has been assign to this char.
            if (lettersIndicesHashTable[charValue] == -1 || lettersIndicesHashTable[charValue] < headPointer){
                lettersIndicesHashTable[charValue] = tailPointer;

            } else {

                if ((tailPointer - headPointer) > maxSubstrLength){
                    maxSubstrLength = tailPointer - headPointer;
                }

                // assign the head-pointer to the next character of the founded (duplicate) character.
                headPointer = lettersIndicesHashTable[charValue] + 1;
            }

            lettersIndicesHashTable[charValue] = tailPointer;
            tailPointer++;
        }

        // check if rest of string finished with a unique characters (last possible case)
        if ((tailPointer - headPointer) > maxSubstrLength){
            maxSubstrLength = tailPointer - headPointer;
        }

        return maxSubstrLength;
    }

    private int[] initializeCharsHashTable() {
        // ascii of 'a' is 97 --> shift all characters by -97.
        // ('a' will index is 0)
        // -1 for unassigned index\
        final int NUM_OF_ENGLISH_LETTERS = 26;

        int[] hashTable = new int[NUM_OF_ENGLISH_LETTERS];
        for (int i=0; i< hashTable.length; i++){
            hashTable[i] = -1;
        }
        return hashTable;
    }
}
