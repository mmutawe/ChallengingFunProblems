package stacks.validate_parentheses_with_minimum_remove;

import testsamples.stacks.StacksTestSampleSML;

import static testsamples.stacks.StacksTestSampleSML.*;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void testMinRemoveParenthesesValidator(){

        MinRemoveParenthesesValidator minRemoveParenthesesValidator = new MinRemoveParenthesesValidatorImpl();

        String format = "%-10s%s";

        System.out.printf(format, PARENTHESES_TEST_SAMPLE_EMPTY,
                " --> validate --> " + minRemoveParenthesesValidator.validate(PARENTHESES_TEST_SAMPLE_EMPTY) + "\n");

        System.out.printf(format, PARENTHESES_TEST_SAMPLE_ONE_ELEMENT,
                " --> validate --> " + minRemoveParenthesesValidator.validate(PARENTHESES_TEST_SAMPLE_ONE_ELEMENT) + "\n");

        System.out.printf(format, PARENTHESES_TEST_SAMPLE_1,
                " --> validate --> " + minRemoveParenthesesValidator.validate(PARENTHESES_TEST_SAMPLE_1) + "\n");

        System.out.printf(format, PARENTHESES_TEST_SAMPLE_7,
                " --> validate --> " + minRemoveParenthesesValidator.validate(PARENTHESES_TEST_SAMPLE_7) + "\n");

        System.out.printf(format, PARENTHESES_TEST_SAMPLE_8,
                " --> validate --> " + minRemoveParenthesesValidator.validate(PARENTHESES_TEST_SAMPLE_8) + "\n");

        System.out.printf(format, PARENTHESES_TEST_SAMPLE_9,
                " --> validate --> " + minRemoveParenthesesValidator.validate(PARENTHESES_TEST_SAMPLE_9) + "\n");

        System.out.println();
    }

    public static void runAllTests() {
        testMinRemoveParenthesesValidator();
        System.out.println("-------------------------------");
    }
}
