package opg2;

public interface Deque23Y<E> {

    public void addFirst(E element);

    public void addLast(E element);

    public E removeFirst();

    public E removeLast();

    public E getFirst();

    public E getLast();

    public boolean isEmpty();

    public void clear();

    public int size();
}
