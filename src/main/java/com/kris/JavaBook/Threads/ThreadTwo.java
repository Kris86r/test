package com.kris.JavaBook.Threads;

class ThreadTwo implements Runnable {
    Accum a = Accum.getAccum();

    @Override
    public void run() {
        for (int x = 0; x < 99; x++) {
            a.updateCounter(1);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {

            }
        }
        System.out.println("two " + a.getCount());
    }
}
