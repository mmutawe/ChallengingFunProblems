package strings.Length_substring_Unique_chars;

// Given:
//      - a string
// Constrains:
//      - substring is contiguous (look for substring not subsequence)
//      - case sensitivity does not matter (all lowercase)
//      - all chars are letters
// TODO - Required:
//      find the length of the longest substring without repeating characters.
//      Ex: "abbcac" --> 3 (which is "abc")
public interface UniqueSubString {
    int lengthOfLongestSubstringV1(String str);
}
