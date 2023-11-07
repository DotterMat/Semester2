package Opg1;

import java.util.Stack;

public class testLinkedStack23Y {
    public static void main(String[] args) {
        Stack<Integer> mainStack = new Stack<>();
        Stack23Y<Integer> linkedStack = new LinkedStack23Y<>(mainStack);
        linkedStack.push(4);
        linkedStack.push(3);

        System.out.println(linkedStack.peek());

        System.out.println(linkedStack.pop());

        System.out.println(linkedStack.isEmpty());

        linkedStack.clear();
        System.out.println(linkedStack.isEmpty());

        System.out.println(linkedStack.size());

        linkedStack.push(3);
        linkedStack.push(5);
        System.out.println(linkedStack.size());

        System.out.println();
        System.out.println();

        Stack23Y<Integer> arrayStack = new ArrayStack23Y<>();
        arrayStack.push(3);
        arrayStack.push(4);
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.pop());

        System.out.println(arrayStack.isEmpty());

        arrayStack.clear();
        System.out.println(arrayStack.isEmpty());

        arrayStack.push(3);
        arrayStack.push(4);
        System.out.println(arrayStack.size());

        System.out.println();
        System.out.println();

        Stack23Y<Integer> dequeStack = new DequeStack23Y<>();
        dequeStack.push(4);
        dequeStack.push(5);
        System.out.println(dequeStack.peek());
        System.out.println(dequeStack.pop());
        System.out.println(dequeStack.isEmpty());

        dequeStack.clear();
        System.out.println(dequeStack.isEmpty());

        dequeStack.push(4);
        dequeStack.push(5);
        System.out.println(dequeStack.size());
    }


}
