package strings.all_possible_parentheses;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleParenthesesProducerImpl implements AllPossibleParenthesesProducer {

    @Override
    public List<String> getAllParentheses(int num) {
        List<String> result = new ArrayList<>();
        if (num == 0) {
            return result;
        }

        getAllParentheses(num, 1, 0, "(", result);
        return result;
    }

    private void getAllParentheses(int num, int numOpen, int numClose, String currStr, List<String> result) {

        if (numOpen == num) {
            for (int i = 0; i < numOpen - numClose; i++) {
                currStr += ")";
            }

            result.add(currStr);
            return;
        }

        getAllParentheses(num, numOpen + 1, numClose, currStr + "(", result);

        for (int i = 0; i < numOpen - numClose; i++) {
            currStr += ")";
        }
        numClose = numOpen;

        getAllParentheses(num, numOpen + 1, numClose, currStr + "(", result);
    }
}
