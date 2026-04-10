public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arr = new MyArrayList<>();
        arr.add(5);
        arr.add(1);
        arr.add(10);
        arr.sort();
        System.out.println("Sorted ArrayList: " + arr.get(0) + ", " + arr.get(1));

        MyStack<String> stack = new MyStack<>();
        stack.push("Hello");
        stack.push("World");
        System.out.println("Stack pop: " + stack.pop());
    }
}