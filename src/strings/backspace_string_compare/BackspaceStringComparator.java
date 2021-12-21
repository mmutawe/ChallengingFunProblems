package strings.backspace_string_compare;

// Given:
//      - two strings,
//      - any '#' counts as a backspace
// Constrains:
//      -
// TODO - Required:
//      return if both string are equal when typed
//      Ex: "ab#c" & "az#c" --> "ac" ?= "ac"
public interface BackspaceStringComparator {
    boolean backspaceCompareV1(String text1, String text2);
}
