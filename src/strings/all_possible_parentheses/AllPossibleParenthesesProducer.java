package strings.all_possible_parentheses;

import java.util.List;

// Given:
//      - an integer number
// Constrains:
//      - if number is zero return empty list
// TODO - Required:
//      return all possible sequences of curved brackets (open anc close) for n time integer.
//      Ex: num = 3 --> [ "((()))", "(())()", "()()()", "()(())" ]

public interface AllPossibleParenthesesProducer {

    List<String> getAllParentheses(int num);
}
