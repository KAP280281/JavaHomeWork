package com.pb.kravets.hw13;



import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ProducerConsumer {

    public static void main(String[] args) {
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        Lock readLock = readWriteLock.readLock();
        Lock writeLock = readWriteLock.writeLock();

        ArrayList<Integer> buffer = new ArrayList<Integer>(5);

        Thread produser = new Thread(new Writer(readLock, buffer));
        Thread consumer = new Thread(new Reader(writeLock, buffer));

        produser.setName("Produser");
        consumer.setName("Consumer");

        produser.start();
        consumer.start();

    }
}
