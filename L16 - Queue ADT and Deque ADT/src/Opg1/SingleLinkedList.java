package Opg1;

import java.util.NoSuchElementException;

public class SingleLinkedList<E> implements Queue23Y<E> {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    private class Node {
        private E data;
        private Node nextSibling;

        public Node(E data) {
            this.data = data;
            this.nextSibling = null;
        }

        public E getData() {
            return data;
        }

        public Node getNextSibling() {
            return nextSibling;
        }

        public void setNextSibling(Node nextSibling) {
            this.nextSibling = nextSibling;
        }
    }

    @Override
    /**
     * Add the element at the back of the queue.
     */
    public void add(E e) {
        Node newNode = new Node(e);
        Node node = head;

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNextSibling(newNode);
            tail = newNode;
        }
        size++;
    }


    /**
     * Remove and return the element at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public E remove() {
        Node newNode = head;
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            newNode = head;
            head = head.getNextSibling();
            size--;
        }
        return newNode.getData();
    }

    /**
     * Return the element at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public E element() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.getData();
    }

    /**
     * Return true, if the queue is empty.
     */
    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    /**
     * Remove all elements from the queue.
     */
    @Override
    public void clear() {
    head = null;
    tail = null;
    size = 0;
    }

    /**
     * Return the number of elements in the queue.
     */
    @Override
    public int size() {
        return size;
    }
}
