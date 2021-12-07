package com.riigsoft;

import java.util.Arrays;

import com.riigsoft.array.Array;
import com.riigsoft.linkedlist.LinkedList;

/**
 * @author Abdallah Mahmoud
 * linked in profile {@link https://www.linkedin.com/in/abdallahmahmud/}
 * **/

public class Main {

    public static void main(String[] args) {

        //Array test
        //var numbers = new Array<>();
        var numbers = new Array<>(4); // with initial capacity
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.removeAt(2);
        System.out.println(numbers.indexOf(20));
        System.out.println(numbers.contains(40));
        System.out.println(numbers.size());
        System.out.println(Arrays.toString(numbers.toArray()));

        //LinkedList test
        LinkedList list = new LinkedList();
        list.addFirst(5);
        list.addLast(40);
        list.addAtMiddle(10);
        list.addFirst(5);
        list.addAtMiddle(20);

        System.out.println("Original List :");
        System.out.println(list);
        System.out.println("Methods :");
        System.out.println(list.contains(5));
        System.out.println(list.indexOf(10));
        System.out.println(list.size());

        System.out.println("Reverse List :");
        list.reverse();
        System.out.println(list);

        list.removeFirst();
        list.removeAtMiddle();
        list.removeLast();

        System.out.println("Original List after remove :");
        System.out.println(list);

        System.out.println("Reverse List after remove :");
        list.reverse();
        System.out.println(list);

        System.out.println("Method :");
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.contains(40));
        System.out.println(list.indexOf(20));
        System.out.println(list.size());
    }

}
