package com.javarush.task.pro.task09.task0921;


import java.util.Arrays;

public class NimrodAi {

    public static void main(String[] args) {
        PastryLoader[] pastryLoaders = new PastryLoader[]{new PastryLoader(), new PastryLoader(), new PastryLoader()};

        scanMemory(pastryLoaders);
        replaceTarget(pastryLoaders);
        scanMemory(pastryLoaders);
    }

    public static void scanMemory(PastryLoader[] pastryLoaders) {
        System.out.println();
        for (PastryLoader pastryLoader : pastryLoaders) {
            System.out.println(Arrays.deepToString(pastryLoader.memory));
        }
    }

    public static void replaceTarget(PastryLoader[] pastryLoaders) {
        for (int i = 0; i < pastryLoaders.length; i++) {
            if (pastryLoaders[i].toString().toLowerCase().contains("Nimrod")) {
                pastryLoaders[i].toString().replace("Nimrod", "pirate ship");
            }
        }
        //  String[] str = new String[]{String.format(Arrays.toString(pastryLoaders))
        //          .replaceAll("Nimrod".toLowerCase(), "pirate ship")};
    }
}






























