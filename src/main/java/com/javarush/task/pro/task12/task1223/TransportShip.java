package com.javarush.task.pro.task12.task1223;

public class TransportShip {
    public Integer speed;
    public Integer acceleration;
    public Passenger[] passengers;
    public OnBoardSystem onBoardSystem = new OnBoardSystem();

    public class OnBoardSystem {
        public Integer calculateJumpTime(Integer distance) {
            int time = 0;
            while (speed * ++time + acceleration * time * time / 2 < distance);
            return --time;
        }
    }
}
//     int count = 0;
//     double result = 0;
//     while (result < distance) {
//         count++;
//         result = speed * count + acceleration * count * count / 2;
//     }
//     count--;
//     return count;































