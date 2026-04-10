public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> list = new MyArrayList<>();
    public void insert(T item) {
        list.add(item);
        int i = list.size() - 1;
        while (i > 0 && list.get(i).compareTo(list.get((i - 1) / 2)) < 0) {
            T temp = list.get(i);
            list.set(i, list.get((i - 1) / 2));
            list.set((i - 1) / 2, temp);
            i = (i - 1) / 2;
        }
    }
}