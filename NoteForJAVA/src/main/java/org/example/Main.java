package org.example;

public class Main {
    public static void main(String[] args) {
        /*Generic01<String> generic01 = new Generic01<>();

        generic01.add("item1");
        generic01.add("item2");
        generic01.show();

        Generic01<Integer> generic02 = new Generic01<>();
        generic02.add(43);
        generic02.add(5425);
        generic02.show();*/

        // 와일드카드
        Generic01<Cat> cat = new Generic01<>();
        cat.add(new Cat());
        Generic01<Dog> dog = new Generic01<>();
        dog.add(new Dog());
        Generic01.cryingAnimalList(cat);
        Generic01.cryingAnimalList(dog);
    }
}