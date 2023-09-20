package Opg3;

import java.util.Arrays;

public class ArrayBag<E> implements Bag<E> {
    // the array to hold the items
    private final E[] items;
    // current number of items in the bag,
    // items are at index 0..size-1
    private int size;

    /** Create a bag with the given capacity. */
    public ArrayBag(int capacity) {
        @SuppressWarnings("unchecked")
        E[] empty = (E[]) new Object[capacity];
        items = empty;
        size = 0;
    }

    /** Create a bag with capacity 10. */
    public ArrayBag() {
		this(10);
    }

    @Override
    public int getCurrentSize() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == items.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E newEntry) {
      if(isFull()) {
          return false;
      }
      items[size] = newEntry;
      size++;
      return true;
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            return null;
        }
       int randomIndex = (int) (Math.random() * size);
       E removedItem = items[randomIndex];
       items[randomIndex] = items[size - 1];
       items[size - 1] = null;
       size--;
       return removedItem;
    }

    @Override
    public boolean remove(E anEntry) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(anEntry)) {
                items[i] = items[size - 1];
                items[size - 1] = null;
                size--;
                return true;
            }

        }
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(items,null);
        size = 0;
    }

    @Override
    public int getFrequencyOf(E anEntry) {
       int frequency = 0;
        for (int i = 0; i < size; i++) {
            if(items[i].equals(anEntry)) {
                frequency++;
            }
        }
        return frequency;
    }

    @Override
    public boolean contains(E anEntry) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(anEntry)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E[] toArray() {
        return Arrays.copyOf(items,size);
    }
}
