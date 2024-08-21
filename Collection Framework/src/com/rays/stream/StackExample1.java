package com.rays.stream;

import java.util.Stack;

public class StackExample1 {
    public static void main(String[] args) {
        // Create the first stack and push "A" to "Z" onto it
        Stack<Character> firstStack = new Stack<>();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            firstStack.push(ch);
        }

        // Create the second stack and transfer all items from the first stack to the second stack
        Stack<Character> secondStack = new Stack<>();
        while (!firstStack.isEmpty()) {
            secondStack.push(firstStack.pop());
        }

        // Pop all items from the second stack and print them
        while (!secondStack.isEmpty()) {
            System.out.print(secondStack.pop() + " ");
        }
    }
}
