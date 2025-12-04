package Midterms;

import java.util.ArrayList;

public class CardStack {
    private ArrayList<Card> stack;

    public CardStack() {
        stack = new ArrayList<>();
    }

    public void push(Card card) {
        stack.add(card); // top of stack
    }

    public Card pop() {
        if (isEmpty()) return null;
        return stack.remove(stack.size() - 1);
    }

    public Card peek() {
        if (isEmpty()) return null;
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public int size() {
        return stack.size();
    }

    public void printStack() {
        if (stack.size() == 0) {
            System.out.println("No cards.");
            return;
        }

        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println("- " + stack.get(i));
        }
    }
}
