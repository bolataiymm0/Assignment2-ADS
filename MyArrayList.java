import java.util.Iterator;

public class MyArrayList<T extends Comparable<T>> implements MyList<T> {
    private Object[] elements;
    private int size = 0;

    public MyArrayList() {
        this.elements = new Object[10];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
    }

    private void increaseBuffer() {
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < size; i++) newElements[i] = elements[i];
        elements = newElements;
    }

    @Override
    public void add(T item) {
        if (size == elements.length) increaseBuffer();
        elements[size++] = item;
    }

    @Override
    public void add(int index, T item) {
        if (size == elements.length) increaseBuffer();
        for (int i = size; i > index; i--) elements[i] = elements[i - 1];
        elements[index] = item;
        size++;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) elements[i] = elements[i + 1];
        size--;
    }

    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (((T)elements[j]).compareTo((T)elements[j+1]) > 0) {
                    Object temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = temp;
                }
            }
        }
    }

    @Override public int size() { return size; }
    @Override public void clear() { size = 0; }
    @Override public void addFirst(T item) { add(0, item); }
    @Override public void addLast(T item) { add(item); }
    @Override public T getFirst() { return get(0); }
    @Override public T getLast() { return get(size - 1); }
    @Override public void removeFirst() { remove(0); }
    @Override public void removeLast() { remove(size - 1); }
    @Override public void set(int index, T item) { checkIndex(index); elements[index] = item; }
    @Override public boolean exists(Object object) { return indexOf(object) != -1; }
    @Override public int indexOf(Object object) {
        for (int i = 0; i < size; i++) if (elements[i].equals(object)) return i;
        return -1;
    }
    @Override public int lastIndexOf(Object object) {
        for (int i = size - 1; i >= 0; i--) if (elements[i].equals(object)) return i;
        return -1;
    }
    @Override public Object[] toArray() {
        Object[] arr = new Object[size];
        for (int i = 0; i < size; i++) arr[i] = elements[i];
        return arr;
    }
    @Override public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int cursor = 0;
            public boolean hasNext() { return cursor < size; }
            public T next() { return get(cursor++); }
        };
    }
}