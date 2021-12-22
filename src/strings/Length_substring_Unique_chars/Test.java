package strings.Length_substring_Unique_chars;

import testsamples.strings.StringsTestSampleSML;

import static testsamples.strings.StringsTestSampleSML.STR_TEST_SAMPLE_3;
import static testsamples.strings.StringsTestSampleSML.STR_TEST_SAMPLE_4;
import static testsamples.strings.StringsTestSampleSML.STR_TEST_SAMPLE_5;
import static testsamples.strings.StringsTestSampleSML.STR_TEST_SAMPLE_EMPTY;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void testLengthOfLongestSubstringV1(){

        UniqueSubString uniqueSubString = new UniqueSubStringImpl();

        System.out.println("* Longest substring length:");
        String format = "%-10s%s";

        System.out.printf(format, STR_TEST_SAMPLE_3,
                " --> " + uniqueSubString.lengthOfLongestSubstringV1(STR_TEST_SAMPLE_3) + "\n");

        System.out.printf(format, STR_TEST_SAMPLE_4,
                " --> " + uniqueSubString.lengthOfLongestSubstringV1(STR_TEST_SAMPLE_4) + "\n");

        System.out.printf(format, STR_TEST_SAMPLE_5,
                " --> " + uniqueSubString.lengthOfLongestSubstringV1(STR_TEST_SAMPLE_5) + "\n");

        System.out.printf(format, STR_TEST_SAMPLE_EMPTY,
                " --> " + uniqueSubString.lengthOfLongestSubstringV1(STR_TEST_SAMPLE_EMPTY) + "\n");

    }
    public static void runAllTests() {
        testLengthOfLongestSubstringV1();
        System.out.println("-------------------------------");
    }
}
