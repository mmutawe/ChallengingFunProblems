package strings.validate_almost_palindrome;

import testsamples.strings.StringsTestSampleSML;

import static testsamples.strings.StringsTestSampleSML.*;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void testAlmostPalindromeValidatorV1() {

        AlmostPalindromeValidator almostPalindromeValidator = new AlmostPalindromeValidatorImpl();

        System.out.println("* Palendrome Validator:");
        String format = "%-15s%s";
//
//        System.out.printf(format, STR_TEST_SAMPLE_6
//                , " --> " + almostPalindromeValidator.isAlmostPalindromeV1(STR_TEST_SAMPLE_6) + "\n");
//
//        System.out.printf(format, STR_TEST_SAMPLE_7
//                , " --> " + almostPalindromeValidator.isAlmostPalindromeV1(STR_TEST_SAMPLE_7) + "\n");
//
//        System.out.printf(format, STR_TEST_SAMPLE_9
//                , " --> " + almostPalindromeValidator.isAlmostPalindromeV1(STR_TEST_SAMPLE_9) + "\n");
//
//        System.out.printf(format, STR_TEST_SAMPLE_10
//                , " --> " + almostPalindromeValidator.isAlmostPalindromeV1(STR_TEST_SAMPLE_10) + "\n");
//
//        System.out.printf(format, STR_TEST_SAMPLE_11
//                , " --> " + almostPalindromeValidator.isAlmostPalindromeV1(STR_TEST_SAMPLE_11) + "\n");
//
//        System.out.printf(format, STR_TEST_SAMPLE_12
//                , " --> " + almostPalindromeValidator.isAlmostPalindromeV1(STR_TEST_SAMPLE_12) + "\n");

        System.out.printf(format, STR_TEST_SAMPLE_13
                , " --> " + almostPalindromeValidator.isAlmostPalindromeV1(STR_TEST_SAMPLE_13) + "\n");

//        System.out.printf(format, STR_TEST_SAMPLE_3
//                , " --> " + almostPalindromeValidator.isAlmostPalindromeV1(STR_TEST_SAMPLE_3) + "\n");
//

    }


    public static void runAllTests() {
        testAlmostPalindromeValidatorV1();
        System.out.println("-------------------------------");
    }
}
