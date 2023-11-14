package opg2;

import java.util.NoSuchElementException;

public class doubleLinkedNodes<E> implements Deque23Y<E> {
    Node<E> header;
    Node<E> trailer;
    private int size;

    public doubleLinkedNodes() {
        header = new Node<>(null);
        trailer = new Node<>(null);
        header.next = trailer;
        trailer.prev = header;
        size = 0;
    }

    private static class Node<E> {
        E data;
        private Node<E> prev;
        private Node<E> next;
        private final E element;

        Node(E element) {
            this.element = element;
            this.next = null;
            this.prev = null;
        }
    }

    @Override
    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.prev = header;
        newNode.next = header.next;
        header.prev.next = newNode;
        header.prev = newNode;
        size++;
    }

    @Override
    public void addLast(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.prev = trailer;
        newNode.next = trailer.next;
        trailer.next.prev = newNode;
        trailer.next = newNode;
        size++;
    }

    @Override
    public E removeFirst() {
        Node<E> newNode = header.next;
        header.next = newNode;
        newNode.prev.next = header;
        size--;
        return newNode.element;
    }

    @Override
    public E removeLast() {
        Node<E> removedNode = trailer.next;
        trailer.prev = removedNode;
        removedNode.prev.next = trailer;
        size--;
        return removedNode.element;
    }

    @Override
    public E getFirst() {
        if (header.next != trailer) {
            return header.next.element;
        }
        throw new NoSuchElementException();
    }
    @Override
    public E getLast() {
        return null;
        }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }
}


