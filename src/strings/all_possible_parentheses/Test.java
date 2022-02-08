package strings.all_possible_parentheses;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void testPalindromeValidatorV1() {

        AllPossibleParenthesesProducer allPossibleParenthesesProducer = new AllPossibleParenthesesProducerImpl();

        int numOfOneSideParentheses = 0;
        System.out.println(numOfOneSideParentheses + " --> "
                + allPossibleParenthesesProducer.getAllParentheses(numOfOneSideParentheses));

        numOfOneSideParentheses = 1;
        System.out.println(numOfOneSideParentheses + " --> "
                + allPossibleParenthesesProducer.getAllParentheses(numOfOneSideParentheses));

        numOfOneSideParentheses = 2;
        System.out.println(numOfOneSideParentheses + " --> "
                + allPossibleParenthesesProducer.getAllParentheses(numOfOneSideParentheses));

        numOfOneSideParentheses = 3;
        System.out.println(numOfOneSideParentheses + " --> "
                + allPossibleParenthesesProducer.getAllParentheses(numOfOneSideParentheses));
    }

    public static void runAllTests() {
        testPalindromeValidatorV1();
        System.out.println("-------------------------------");
    }
}
