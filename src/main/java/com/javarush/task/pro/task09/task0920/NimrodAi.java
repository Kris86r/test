package com.javarush.task.pro.task09.task0920;


import java.util.Arrays;

public class NimrodAi {

    public static String[] diningRoom = {
            "button for emergency meeting",
            "table", "table", "table", "table", "table",
            "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench",
            "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench", "bench"};
    public static String[] o2 = {"plant", "plant"};
    public static String[] medRoom = {"bed", "bed", "bed", "bed", "SCAN-MO-TRON-2000", "liquid analyser"};
    public static String[] armoury = {"cannon launcher", "chair"};
    public static String[] securityRoom = {"rack", "rack", "table"};
    public static String[] reactor = {"reactor"};
    public static String[] telecom = {"computer", "computer", "computer", "table", "chair"};
    public static String[] warehouse = {
            "container", "container", "container",
            "box", "box", "box", "box", "box", "box",
            "barrel", "barrel", "barrel", "barrel"};
    public static String[] controlRoom = {"interactive ship map", "chair", "chair", "chair"};
    public static String[] powerRoom = {"power lamp", "power lamp", "power lamp", "power lamp", "power lamp", "power lamp", "power lamp"};

    public static void main(String[] args) {

        String[] roomNames = {"diningRoom", "o2", "medRoom", "armoury", "securityRoom", "reactor",
                "telecom", "warehouse", "controlRoom", "powerRoom"};
        for (String room : roomNames) {
            if (checkPirates(room)) {
                openFloodgates(room);
            }
        }
    }

    public static boolean checkPirates(String roomName) {
        String[] room = getRoomByName(roomName);
        if (room == null) {
            return false;
        }

        String[] scanResult = RoomScanner.scanRoom(roomName);
        System.out.printf("В %s обнаружено: %s\n", roomName, Arrays.toString(scanResult));

        if (room.length < scanResult.length) {
            return true;
        }
        for (String elScan : scanResult) {
            boolean isAbsent = true;
            for (String elRoom : room) {
                if (elRoom.equals(elScan)) {
                    isAbsent = false;
                    break;
                }
            }
            if (isAbsent) {
                return true;
            }
        }
        return false;
    }

    public static void openFloodgates(String roomName) {
        System.out.printf("ВНИМАНИЕ, открытие шлюзов в %s\n\n", roomName);
        Arrays.fill(getRoomByName(roomName), null);
    }

    public static String[] getRoomByName(String roomName) {
        if ("diningRoom".equals(roomName)) {
            return NimrodAi.diningRoom;
        } else if ("o2".equals(roomName)) {
            return NimrodAi.o2;
        } else if ("medRoom".equals(roomName)) {
            return NimrodAi.medRoom;
        } else if ("armoury".equals(roomName)) {
            return NimrodAi.armoury;
        } else if ("securityRoom".equals(roomName)) {
            return NimrodAi.securityRoom;
        } else if ("reactor".equals(roomName)) {
            return NimrodAi.reactor;
        } else if ("telecom".equals(roomName)) {
            return NimrodAi.telecom;
        } else if ("warehouse".equals(roomName)) {
            return NimrodAi.warehouse;
        } else if ("controlRoom".equals(roomName)) {
            return NimrodAi.controlRoom;
        } else if ("powerRoom".equals(roomName)) {
            return NimrodAi.powerRoom;
        } else {
            return null;
        }
    }
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        