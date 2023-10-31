package org.example;

import java.util.ArrayList;

class Animals {
    public void crying() {
        System.out.println("동물들이 울고 있어!");
    }
}

class Cat extends Animals {
    public void crying() {
        System.out.println("야옹~~~");
    }
}
class Dog extends Animals {
    public void crying() {
        System.out.println("멍멍!");
    }
}

public class Generic01<T> {
    ArrayList<T> list = new ArrayList<>();
    public static void cryingAnimalList(Generic01<? extends Animals> items) {
        Animals a = items.get(0);
        a.crying();
    }
    void add(T item) {
        list.add(item);
    }

    T get(int idx) {
        return list.get(idx);
    }

    void show() {
        for(T item : list) {
            System.out.println("list의 내용물 : " + item);
        }
    }
}
