package strings.Length_substring_Unique_chars;

public class UniqueSubStringImpl implements UniqueSubString {

    // *** Brute Force Solution ***
    // Space: k , Time: O(n * k) - where k is the length of substr
    @Override
    public int lengthOfLongestSubstringV1(String str) {
        String subStr = "";
        int maxSubstrLength = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < subStr.length(); j++) {
                if (str.charAt(i) == subStr.charAt(j)) {
                    subStr = subStr.substring(j + 1);
                    break;
                }
            }
            subStr += str.charAt(i);

            if (subStr.length() > maxSubstrLength) {
                maxSubstrLength = subStr.length();
            }
        }

        return maxSubstrLength;
    }
}
