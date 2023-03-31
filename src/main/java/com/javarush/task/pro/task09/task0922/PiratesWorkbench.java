package com.javarush.task.pro.task09.task0922;


import java.util.Arrays;

public class PiratesWorkbench {

    public static String[] piratesDB = new String[]{
            "Drax",
            "Yondu Udonta",
            "Maz Kanata",
            "キャプテン・ハーロック",
            "Star-Lord",
            "Christopher Summers",
            "Крысс",
            "Весельчак У",
            "Nebula",
            "Rocket",
            "Han Solo",
            "boba Fett"
    };

    public static void main(String[] args) {
        System.out.println(Arrays.toString(piratesDB));

        corruptDB();
        addTwoNames();

        System.out.println(Arrays.toString(piratesDB));
    }

    public static void corruptDB() {
        int j = 0;
        for (int i = 0; i < piratesDB.length; i++) {
            if (piratesDB[i].contains("b") && j < 2) {
                piratesDB[i] = piratesDB[i].replaceAll("b", "\b");
                j++;
            }
        }
    }

    public static void addTwoNames() {
        String[] array = Arrays.copyOf(piratesDB, piratesDB.length + 2);
        array[array.length - 2] = "Рыжий Амиго";
        array[array.length - 1] = "Одноглазый Диего";
        piratesDB = array;
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    