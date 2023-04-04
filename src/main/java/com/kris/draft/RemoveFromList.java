package com.kris.draft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveFromList {

    public static List<String> list = new ArrayList<>(Arrays.asList("For", "Example", "Remove", "Java", "draft"));

    public static void main(String[] args) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Remove")) {
                list.remove(list.get(i));
                i--;
            }
        }
        copy();
        System.out.println(list);
    }

    public static void copy() {
        ArrayList<String> copyList = new ArrayList<>(list);
        for (String str : copyList) {
            if (str.equals("For")) {
                list.remove(str);
            }
        }
    }
}
