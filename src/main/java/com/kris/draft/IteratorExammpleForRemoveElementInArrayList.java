package com.kris.draft;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExammpleForRemoveElementInArrayList {

   public static ArrayList<Cat> arrayList = new ArrayList<>();
    public static void main(String[] args) {

        Cat sofia = new Cat("Sofia");
        Cat murzik = new Cat("Murzik");

        arrayList.add(sofia);
        arrayList.add(new Cat("Persic"));
        arrayList.add(new Cat("Bell"));
        arrayList.add(murzik);

        Iterator<Cat> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals("Persic")) {
                iterator.remove();
            }
        }
      //   for (Cat cat: arrayList) {
      //       System.out.println(cat.getName());
      //   }
        System.out.println(arrayList.toString());
    }
}

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name is " + name;
    }
}