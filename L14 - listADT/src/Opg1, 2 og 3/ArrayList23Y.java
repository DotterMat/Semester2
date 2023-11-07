package Opg1;

import java.util.Arrays;
import java.util.Iterator;

/**
 * An array based implementation of the List ADT.
 */
public class ArrayList23Y<E> implements Opg1.List23Y<E> {
    @SuppressWarnings("unchecked")
    private E[] data = (E[]) new Object[4];
    private int size = 0;
    // data contains elements at index 0..size-1 and null else

    /**
     * Add the element to the end of this list.
     */
    @Override
    public void add(E e) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size] = e;
        size++;
    }

    /**
     * Remove the element from this list.
     * Return true, if this list is modified.
     */
    @Override
    public boolean remove(E e) {
        int i = 0;
        while (i < size) {
            if (data[i].equals(e)) {
                for (int j = i; j < size - 1; j++) {
                    data[i] = data[j + 1];
                }
                size--;
                data[size] = null;
                return true;
            }
            i++;
        }
        return false;
    }

    /**
     * Return true, if this list contains the element.
     */
    @Override
    public boolean contains(E e) {
        int i = 0;
        while (i < size) {
            if (data[i].equals(e)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /**
     * Remove all elements from this list.
     */


    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    /**
     * Return the size of this list.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Return true, if this list is empty.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Return the element at the index.
     * Throw IndexOutOfBoundsException, if index < 0 or index >= size().
     */
    @Override
    public E get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        E e = data[index];
        return e;
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
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        if (index < size) {
            data[index] = e;
            size++;
        }
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
        E e = data[index];

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;

        return e;
    }


    /**
     * Return the index of the element in this list.
     * Return -1, if this list does not contain the element.
     */
    @Override
    public int indexOf(E e) {
        for (int index = 0; index < size; index++) {
            if (data[index].equals(e)) {
                return index;
            }
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
        return new arraylistiteratorClass();
    }

    private class arraylistiteratorClass implements Iterator<E> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public E next() {
            index++;
            E e = data[index];
            return e;
        }

    }


//-------------------------------------------

    @Override
    public String toString() {
        return null;
    }
}
