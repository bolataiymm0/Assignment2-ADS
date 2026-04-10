[README.md](https://github.com/user-attachments/files/26628524/README.md)
# Assignment 2: Custom Data Structures

## Project Overview
This project is a manual implementation of fundamental data structures in Java without using the standard `java.util.*` library (except for `Iterator`). It includes the development of physical structures (ArrayList, LinkedList) and logical structures (Stack, Queue, MinHeap) built upon them.

## Implemented Structures

### 1. Physical Structures
* **MyArrayList**: A dynamic array implementation. [cite_start]It automatically resizes when the capacity is reached, providing $O(1)$ access by index[cite: 26, 28].
* **MyLinkedList**: A doubly linked list. [cite_start]Each node contains references to both the next and previous nodes, allowing for efficient insertions and deletions at both ends[cite: 32, 34, 35].

### 2. Logical Structures (Justification)
[cite_start]According to the assignment, I have chosen the following physical bases for the logical structures:

* **MyStack**: Implemented using **MyArrayList**. 
  * *Reason*: Stack follows LIFO. Adding and removing from the end of an ArrayList is an $O(1)$ operation, making it highly efficient for stack operations.
* **MyQueue**: Implemented using **MyLinkedList**.
  * *Reason*: Queue follows FIFO. [cite_start]Removing the first element in an ArrayList takes $O(n)$, but in a LinkedList with a `head` pointer, it takes $O(1)$[cite: 36, 37].
* **MyMinHeap**: Implemented using **MyArrayList**.
  * *Reason*: A heap is a complete binary tree. Using an array allows us to calculate parent/child positions using simple math ($2i + 1$, $2i + 2$), which is much faster than traversing node pointers.

## Features
* [cite_start]Full implementation of the `MyList<T>` interface [cite: 7-25].
* Support for generics (`T`).
* Implementation of the `Iterable` interface for use in for-each loops.
* [cite_start]Custom `sort()` method using `Comparable`.

## How to Run
1. Clone the repository.
2. Compile the project: `javac Main.java`.
3. Run the tests: `java Main`.
