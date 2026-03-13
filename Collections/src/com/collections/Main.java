package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(12);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int x : list) {
            System.out.println(x);
        }
        System.out.println(list.contains(5));
        list.remove(2);
        list.add(1, 29); // takes the place shifting all the elements
        System.out.println(list);
        list.set(1,50);
        System.out.println(list); // replaces the element at the index
    }
}
