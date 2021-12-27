package com.pb.kravets.hw13;

import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;

public class Writer implements Runnable {
    private final Lock readLock;
    private final List buffer;


    public Writer(Lock readLock, List buffer) {
        this.readLock = readLock;
        this.buffer = buffer;
    }

    public void run() {
        while (true) {
            String threadName = Thread.currentThread().getName();
            readLock.lock();
            try {
                for (int i = 0; i <= 4; i++) {
                    int data = new Random().nextInt(100);
                    Thread.sleep(2000);
                    buffer.add(data);
                    System.out.println(threadName +" запись в буфер " + data );
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                readLock.unlock();
            }
        }
    }
}
