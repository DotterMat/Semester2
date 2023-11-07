package Opg1;

import java.util.Stack;

// OPGAVE 1 med single-linked liste.
public class LinkedStack23Y<E> implements Stack23Y<E> {
    private Stack<E> stak = null;
    // the number of element in the stack
    int size = 0;


    public LinkedStack23Y(Stack<E> stak) {
        this.stak = stak;
    }

    /**
     * Add the element at the top of this stack.
     */
    @Override
    public void push(E entry) {
        stak.push(entry);

    }


    /**
     * Remove and return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    @Override
    public E pop() {
        if (stak.isEmpty()) {
            throw new RuntimeException();
        }
        return stak.pop();
    }

    /**
     * Return this stack's top element.
     * Throw NoSuchElementException, if the stack is empty.
     */
    @Override
    public E peek() {
        if (stak.isEmpty()) {
            throw new RuntimeException();
        }
        return stak.peek();
    }

    /**
     * Return true, if this stack is empty.
     */
    @Override
    public boolean isEmpty() {
        if (stak.isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * Removes all elements from this stack.
     */
    @Override
    public void clear() {
        stak.clear();
    }

    /**
     * Return the number of elements in the stack.
     */
    @Override
    public int size() {
        return stak.size();

        //-------------------------------------------------------------------------

    }
}