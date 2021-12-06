package com.riigsoft.linkedlist;

import java.util.NoSuchElementException;
/**
 * @author Abdallah Mahmoud
 * linked in profile {@link https://www.linkedin.com/in/abdallahmahmud/}
 * **/

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    private class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    /**
     * Insert at middle
     **/
    public void addMiddle(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            var previous = first;
            Node current = null;
            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);

            // [5, 10]
            for (int i = 0; i < count; i++) {
                current = previous;
                previous = previous.next;
            }
            current.next = node;
            node.next = previous;
        }
        size++;
    }

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;

            index++;
        }
        return -1;
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "[]";

        var node = first;
        StringBuilder data = new StringBuilder();
        while (node != null) {
            data.append(node.value + ", ");
            node = node.next;
        }
        return "[" + data.delete(data.length() - 2, data.length()) + "]";
    }

    private boolean isEmpty() {
        return first == null;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {

        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    /**
     * Remove item at middle
     **/
    public void removeAtMiddle() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {

            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);

            if (first != last) {
                var previous = first;
                Node current = null;
                for (int i = 0; i < count - 1; i++) {
                    current = previous;
                    previous = previous.next;
                }
                if (current != null) {
                    current.next = previous.next;
                } else {
                    first = last = previous.next;
                }
                previous = null;
            } else {
                first = last = null;
            }
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw  new NoSuchElementException();

        var previous = getPrevious(last);
        last = previous;
        if (last != null)
            last.next = null;
        else {
            last = first;
        }

        size--;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        if (isEmpty())
            return new int[0];

        var current = first;
        int[] array = new int[size];

        var index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse() {
        if (isEmpty())
            return;

        var previous = first;
        var current = first.next;

        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromTheEnd(int k) {
        if (isEmpty())
            throw new IllegalArgumentException();

        var a = first;
        var b = first;
        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null)
                throw new IllegalArgumentException();
        }
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }
}
