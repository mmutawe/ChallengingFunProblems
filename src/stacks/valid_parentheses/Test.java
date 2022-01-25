package stacks.valid_parentheses;

import testsamples.stacks.StacksTestSampleSML;

import java.util.Arrays;

import static testsamples.stacks.StacksTestSampleSML.*;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void testParenthesesValidator(){

        ParenthesesValidator parenthesesValidator = new ParenthesesValidatorImpl();

        String format = "%-10s%s";

        System.out.printf(format, PARENTHESES_TEST_SAMPLE_EMPTY,
                " --> is valid ? " + parenthesesValidator.isValid(PARENTHESES_TEST_SAMPLE_EMPTY) + "\n");

        System.out.printf(format, PARENTHESES_TEST_SAMPLE_ONE_ELEMENT,
                " --> is valid ? " + parenthesesValidator.isValid(PARENTHESES_TEST_SAMPLE_ONE_ELEMENT) + "\n");

        System.out.printf(format, PARENTHESES_TEST_SAMPLE_1,
                " --> is valid ? " + parenthesesValidator.isValid(PARENTHESES_TEST_SAMPLE_1) + "\n");

        System.out.printf(format, PARENTHESES_TEST_SAMPLE_2,
                " --> is valid ? " + parenthesesValidator.isValid(PARENTHESES_TEST_SAMPLE_2) + "\n");

        System.out.printf(format, PARENTHESES_TEST_SAMPLE_3,
                " --> is valid ? " + parenthesesValidator.isValid(PARENTHESES_TEST_SAMPLE_3) + "\n");

        System.out.printf(format, PARENTHESES_TEST_SAMPLE_4,
                " --> is valid ? " + parenthesesValidator.isValid(PARENTHESES_TEST_SAMPLE_4) + "\n");

        System.out.printf(format, PARENTHESES_TEST_SAMPLE_5,
                " --> is valid ? " + parenthesesValidator.isValid(PARENTHESES_TEST_SAMPLE_5) + "\n");

        System.out.printf(format, PARENTHESES_TEST_SAMPLE_6,
                " --> is valid ? " + parenthesesValidator.isValid(PARENTHESES_TEST_SAMPLE_6) + "\n");

        System.out.println();
    }

    public static void runAllTests() {
        testParenthesesValidator();
        System.out.println("-------------------------------");
    }
}
