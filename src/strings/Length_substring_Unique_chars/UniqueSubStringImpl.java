package strings.Length_substring_Unique_chars;

public class UniqueSubStringImpl implements UniqueSubString {

    // *** Brute Force Solution ***
    // Space: k , Time: O(n * k) - where k is the length of substr
    @Override
    public int lengthOfLongestSubstringV1(String str) {
        StringBuilder subStr = new StringBuilder();
        int maxSubstrLength = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < subStr.length(); j++) {
                if (str.charAt(i) == subStr.charAt(j)) {
                    subStr = subStr.delete(0, j+1);
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
}
