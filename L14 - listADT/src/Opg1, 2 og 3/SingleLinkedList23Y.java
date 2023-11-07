package Opg1;

import java.util.Iterator;

/**
 * A single-linked nodes based implementation of the List ADT.
 */
public class SingleLinkedList23Y<E> implements Opg1.List23Y<E> {
    private Node<E> head = null;
    private int size = 0;

    /**
     * Add the element to the end of this list.
     */


    @Override
    public void add(E e) {
        if (head == null) {
            head = new Node<>(e);
            size++;
            return;
        }

        Node<E> node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node<>(e);
        size++;
    }

    /**
     * Remove the element from this list.
     * Return true, if this list is modified.
     */
    @Override
    public boolean remove(E e) {
        if (head == null) return false;

        if (head.element.equals(e)) {
            head = head.next;
            size--;
            return true;
        }
        Node<E> node = head;
        while (node.next != null && !node.next.element.equals(e)) {
            node = node.next;
        }
        if (node.next != null) {
            node.next = node.next.next;
            size--;
            return true;
        }
        return false;
    }

    /**
     * Return true, if this list contains the element.
     */
    @Override
    public boolean contains(E e) {
        if (head == null) return false;

        Node<E> node = head;
        while (node != null) {
            if (node.element.equals(e)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    /**
     * Remove all elements from this list.
     */
    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    /**
     * Return the size of this list.
     */
    public int size() {
        return size;
    }

    /**
     * Return true, if this list is empty.
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E get(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> node = head;
        for (int i = 0; i < index; i++) {
            if (node != null) {
                node = node.next;
            }
        }
        return node.element;
    }


    /**
     * Add the element to this list at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index > size().
     * Note: The element can be added at an index equal to size().
     */
    @Override
    public void add(int index, E e) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> node = new Node<>(e);
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node<E> newNode = head;
            for (int i = 0; i < index - 1; i++) {
                newNode = node.next;
            }
            node.next = newNode.next;
            newNode.next = node;
        }
        size++;
    }


    /**
     * Remove and return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */

    @Override
    public E remove(int index) {

        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            Node<E> removedNode = head;
            head = head.next;
            size--;
            return removedNode.element;
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node<E> removedNode = current.next;
            current.next = removedNode.next;
            size--;
            return removedNode.element;
        }
    }


    /**
     * Return the index of the element in this list.
     * Return -1, if this list does not contain the element.
     */
    @Override
    public int indexOf(E e) {
        int index = 0;
        Node<E> node = head;
        while (node != null) {
            if (node.element.equals(e)) {
                return index;
            }
            node = node.next;
            index++;
        }
        return -1;
    }


    /**
     * Return an iterator over this list.
     * Note: While the list is traversed by this iterator,
     * adding or removing an element is not allowed.
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E element = current.element;
                current = current.next;
                return element;
            }
        };
    }


    //-------------------------------------------

    private static class Node<T> {
        private final T element;
        private Node<T> next;

        public Node(T t) {
            this.element = t;
            this.next = null;
        }
    }

    //-------------------------------------------

    @Override
    public String toString() {
        return null;
    }
}
