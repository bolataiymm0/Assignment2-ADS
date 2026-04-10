[README.md](https://github.com/user-attachments/files/26628602/README.md)
# Assignment 2: ArrayList and LinkedList

## Project Overview
This project is a manual implementation of fundamental data structures in Java without using the standard `java.util.*` library (except for `Iterator`). It focuses on physical structures (ArrayList, LinkedList) and logical structures (Stack, Queue, MinHeap) built upon them.

## Implemented Structures

### 1. Physical Structures
* **MyArrayList**: A dynamic array implementation. It automatically resizes when the capacity is reached, providing $O(1)$ access by index.
* **MyLinkedList**: A doubly linked list. Each node contains references to both the next and previous nodes, allowing for efficient insertions and deletions at both ends.

### 2. Logical Structures (Justification)
According to the assignment requirements, I have chosen the following physical bases for the logical structures:

* **MyStack**: Implemented using **MyArrayList**.
    * *Reason*: Stack follows the LIFO principle. Adding and removing from the end of an ArrayList is an $O(1)$ operation, making it the most efficient choice for stack operations.
* **MyQueue**: Implemented using **MyLinkedList**.
    * *Reason*: Queue follows the FIFO principle. While removing the first element in an ArrayList takes $O(n)$ due to shifting, in a LinkedList with a head pointer, it takes $O(1)$.
* **MyMinHeap**: Implemented using **MyArrayList**.
    * *Reason*: A heap is a complete binary tree. Using an array-based structure (ArrayList) allows us to calculate parent and child positions using simple arithmetic ($2i + 1$, $2i + 2$).

## Features
* Full implementation of the `MyList<T>` interface.
* Support for generics (`T`) for type safety.
* Implementation of the `Iterable` interface.
* Custom `sort()` method using `Comparable`.

## How to Run
1. Open the project in IntelliJ IDEA.
2. Run the `Main.java` file.
3. Check the console for test results.
