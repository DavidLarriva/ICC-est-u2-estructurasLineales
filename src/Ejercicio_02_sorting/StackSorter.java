package Ejercicio_02_sorting;

import Materia.Stacks.StackGeneric;

public class StackSorter {
    public StackGeneric<Integer> sort(StackGeneric<Integer> inputStack) {
        StackGeneric<Integer> auxiliaryStack = new StackGeneric<>();

        while (!inputStack.isEmpty()) {
            int currentElement = inputStack.pop();

            while (!auxiliaryStack.isEmpty() && auxiliaryStack.peek() > currentElement) {
                inputStack.push(auxiliaryStack.pop());
            }

            auxiliaryStack.push(currentElement);
        }

        return auxiliaryStack;
    }
}
