public class MyQueue<T extends Comparable<T>> {
    private MyLinkedList<T> list = new MyLinkedList<>();
    public void enqueue(T item) { list.addLast(item); }
    public T dequeue() { T item = list.getFirst(); list.removeFirst(); return item; }
    public boolean isEmpty() { return list.size() == 0; }
}