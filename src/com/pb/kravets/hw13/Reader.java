package com.pb.kravets.hw13;

import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;

public class Reader implements Runnable{
    private final Lock writeLock;
    private final List buffer;

    public Reader(Lock writeLock, List buffer) {
        this.writeLock = writeLock;
        this.buffer = buffer;
    }

    public void run() {
        while (true) {
            String threadName = Thread.currentThread().getName();
            writeLock.lock();
            try {
                Thread.sleep(2000);
                System.out.println(threadName + " чтение из буфера " + buffer.toString());
                buffer.clear();
                System.out.println("Буфер пуст.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                writeLock.unlock();
            }
        }
    }
}
