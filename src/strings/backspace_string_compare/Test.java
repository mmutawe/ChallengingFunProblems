package strings.backspace_string_compare;

import testsamples.strings.StringsTestSampleSML;

import static testsamples.strings.StringsTestSampleSML.*;

public class Test {

    public static void main(String[] args) {
        runAllTests();
    }

    public static void testBackspaceCompareV1(){

        BackspaceStringComparator backspaceStringComparator = new BackspaceStringComparatorImpl();

        System.out.println("text #1:" + STR_TEST_SAMPLE_1_1);
        System.out.println("text #2:" + STR_TEST_SAMPLE_1_2);
        System.out.println("Same text ? " + backspaceStringComparator
                .backspaceCompareV1(STR_TEST_SAMPLE_1_1, STR_TEST_SAMPLE_1_2) + "\n");

        System.out.println("text #1:" + STR_TEST_SAMPLE_1_1);
        System.out.println("text #2:" + STR_TEST_SAMPLE_1_3);
        System.out.println("Same text ? " + backspaceStringComparator
                .backspaceCompareV1(STR_TEST_SAMPLE_1_1, STR_TEST_SAMPLE_1_3) + "\n");

        System.out.println("text #1:" + STR_TEST_SAMPLE_2_1);
        System.out.println("text #2:" + STR_TEST_SAMPLE_2_2);
        System.out.println("Same text ? " + backspaceStringComparator
                .backspaceCompareV1(STR_TEST_SAMPLE_2_1, STR_TEST_SAMPLE_2_2) + "\n");

    }
    public static void runAllTests() {
        testBackspaceCompareV1();
        System.out.println("-------------------------------");
    }
}
