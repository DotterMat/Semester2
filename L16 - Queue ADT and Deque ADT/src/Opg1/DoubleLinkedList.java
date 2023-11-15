package Opg1;

import org.w3c.dom.Node;

import java.util.NoSuchElementException;

public class DoubleLinkedList implements Queue23Y {

    private final Node header = new Node<>(null);
    private final Node trailer = new Node<>(null);
    private int size = 0;

    public DoubleLinkedList() {
        header.next = trailer;
        trailer.prev = header;
    }

    /**
     * Add the element at the back of the queue.
     */
    @Override
    public void add(Object element) {
        Node newNode = new Node(element);
        newNode.prev = trailer.prev;
        newNode.next = trailer;
        trailer.prev.next = newNode;
        trailer.prev = newNode;
        size++;
    }

    /**
     * Return the element at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public Object remove() {
        if (size == 1) {
            throw new NoSuchElementException();
        }
        Node newNode = header.next;
        header.next = newNode;
        newNode.prev.next = header;
        size--;
        return newNode.element;
    }

    /**
     * Return the element at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public Object element() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return header.next.element;
    }

    /**
     * Return true, if the queue is empty.
     */
    @Override
    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        return false;
    }

    /**
     * Remove all elements from the queue.
     */
    @Override
    public void clear() {
    header.next = trailer;
    trailer.prev = header;
    size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private static class Node<T> {
        private final T element;
        private Node<T> next;
        private Node<T> prev;

        public Node(T t) {
            this.element = t;
            this.next = null;
            this.prev = null;
        }
    }
}
