package Ejercicio_01_sign;

import Materia.Stacks.StackGeneric;

public class SignValidator {
    public boolean checkBalance(String sequence) {
        StackGeneric<Character> symbolStack = new StackGeneric<>();

        for (char symbol : sequence.toCharArray()) {
            if (isOpeningBracket(symbol)) {
                symbolStack.push(symbol);
            } else if (isClosingBracket(symbol)) {
                if (symbolStack.isEmpty()) return false;
                char lastOpened = symbolStack.pop();
                if (!areBracketsMatching(lastOpened, symbol)) return false;
            }
        }

        return symbolStack.isEmpty();
    }

    private boolean isOpeningBracket(char bracket) {
        return bracket == '(' || bracket == '{' || bracket == '[';
    }

    private boolean isClosingBracket(char bracket) {
        return bracket == ')' || bracket == '}' || bracket == ']';
    }

    private boolean areBracketsMatching(char openBracket, char closeBracket) {
        return (openBracket == '(' && closeBracket == ')') ||
        (openBracket == '{' && closeBracket == '}') ||
        (openBracket == '[' && closeBracket == ']');
    }
}
