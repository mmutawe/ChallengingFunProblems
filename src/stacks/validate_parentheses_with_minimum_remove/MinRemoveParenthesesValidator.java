package stacks.validate_parentheses_with_minimum_remove;

// Given:
//      String containing only round brackets; '(' & ')', and lowercase character,
// Constrains:
//      - String cant be null
//      - String is considered valid of it is empty or if there are brackets that are all closed
//      - String contain only lowercase characters is valid
// TODO - Required:
//      remove the least amount of brackets so the string is valid and return it
//      Ex: a)bc(d)          , res: abc(d)
//      Ex: (ab(c)d          , res: (abc)d -OR- ab(c)d
//      Ex: ))((             , res: ''
public interface MinRemoveParenthesesValidator {
    String validate(String text);
}
