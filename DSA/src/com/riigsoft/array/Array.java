package com.riigsoft.array;
/**
 * @author Abdallah Mahmoud
 * linked in profile {@link https://www.linkedin.com/in/abdallahmahmud/}
 * **/

public class Array<T>{
    private Object[] items;
    private int count;
    private final int capacity = 3;

    public Array() {
        items = new Object[capacity];
    }
    public Array(int capacity) {
        items = new Object[capacity];
    }

    public void add(T item) {
        if (items.length == count) {
            Object[] newItems = new Object[count * 2];

            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException("Index out of bounds");
        //[20, 30]
        for (int i = index; i < count - 1; i++)
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf(T item) {

        for (int index = 0; index < count; index++)
            if (items[index] == item)
                return index;

        return -1;
    }


    public boolean contains(T item){
        return indexOf(item) != -1;
    }

    public int size(){
        return count;
    }

    public Object[] toArray() {
        Object[] newItems = new Object[count];

        for (int i = 0; i < count; i++)
            newItems[i] = items[i];

        return newItems;
    }
}
