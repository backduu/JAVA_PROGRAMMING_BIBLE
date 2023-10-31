package org.example;

import java.util.ArrayList;

public class Generic01<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int idx) {
        return list.get(idx);
    }

    boolean remove(T item) {
        return list.remove(item);
    }

    int size() {
        return list.size();
    }

    void show() {
        for(T item : list) {
            System.out.println("list의 내용물 : " + item);
        }
    }
}
