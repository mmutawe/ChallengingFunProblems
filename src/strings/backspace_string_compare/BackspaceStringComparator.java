package strings.backspace_string_compare;

// Given:
//      - two strings,
//      - any '#' counts as a backspace
// Constrains:
//      - we can have more than one hash appear beside each other
//      - ignore if there is no character to remove
//      - consider two empty strings as equal
//      - case sensitivity does matter
// TODO - Required:
//      return if both string are equal when typed
//      Ex: "ab#c" & "az#c" --> "ac" ?= "ac"
public interface BackspaceStringComparator {
    boolean backspaceCompareV1(String text1, String text2);
}
