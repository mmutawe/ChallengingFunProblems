package strings.validate_palindrome;

import static testsamples.strings.StringsTestSampleSML.*;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void testPalindromeValidatorV1() {

        PalindromeValidator palindromeValidator = new PalindromeValidatorImpl();

        System.out.println("* Palendrome Validator:");
        String format = "%-15s%s";

        System.out.printf(format, STR_TEST_SAMPLE_6
                , " --> " + palindromeValidator.isPalindromeV1(STR_TEST_SAMPLE_6) + "\n");

        System.out.printf(format, STR_TEST_SAMPLE_7
                , " --> " + palindromeValidator.isPalindromeV1(STR_TEST_SAMPLE_7) + "\n");

        System.out.printf(format, STR_TEST_SAMPLE_EMPTY
                , " --> " + palindromeValidator.isPalindromeV1(STR_TEST_SAMPLE_EMPTY) + "\n");

        System.out.printf(format, STR_TEST_SAMPLE_SingleChar
                , " --> " + palindromeValidator.isPalindromeV1(STR_TEST_SAMPLE_SingleChar) + "\n");

        System.out.printf(format, STR_TEST_SAMPLE_3
                , " --> " + palindromeValidator.isPalindromeV1(STR_TEST_SAMPLE_3) + "\n");

        System.out.printf(format, STR_TEST_SAMPLE_8
                , " --> " + palindromeValidator.isPalindromeV1(STR_TEST_SAMPLE_8) + "\n");
    }

    public static void testPalindromeValidatorV2() {

        PalindromeValidator palindromeValidator = new PalindromeValidatorImpl();

        System.out.println("* Palendrome Validator:");
        String format = "%-15s%s";

        System.out.printf(format, STR_TEST_SAMPLE_6
                , " --> " + palindromeValidator.isPalindromeV2(STR_TEST_SAMPLE_6) + "\n");

        System.out.printf(format, STR_TEST_SAMPLE_7
                , " --> " + palindromeValidator.isPalindromeV2(STR_TEST_SAMPLE_7) + "\n");

        System.out.printf(format, STR_TEST_SAMPLE_EMPTY
                , " --> " + palindromeValidator.isPalindromeV2(STR_TEST_SAMPLE_EMPTY) + "\n");

        System.out.printf(format, STR_TEST_SAMPLE_SingleChar
                , " --> " + palindromeValidator.isPalindromeV2(STR_TEST_SAMPLE_SingleChar) + "\n");

        System.out.printf(format, STR_TEST_SAMPLE_3
                , " --> " + palindromeValidator.isPalindromeV2(STR_TEST_SAMPLE_3) + "\n");

        System.out.printf(format, STR_TEST_SAMPLE_8
                , " --> " + palindromeValidator.isPalindromeV2(STR_TEST_SAMPLE_8) + "\n");
    }

    public static void runAllTests() {
        testPalindromeValidatorV1();
        System.out.println("-------------------------------");
        testPalindromeValidatorV2();
    }
}
