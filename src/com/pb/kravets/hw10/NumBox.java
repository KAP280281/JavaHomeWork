package com.pb.kravets.hw10;

import com.pb.kravets.hw3.Array;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.List;

public class NumBox <T extends Number> {
    private final List<T> chislo;
    private int maxSize;

    public NumBox(int maxSize) {
        chislo = new ArrayList<>(maxSize);
        this.maxSize=maxSize;
    }

    public void add(T num) {
        if (chislo.size()<=(maxSize-1)) {
            chislo.add(num);
        } else {
            throw new ArrayIndexOutOfBoundsException("Массив переполнен!!!");
        }
    }

    public T get(int index) {
        return chislo.get(index);
    }

    public int length() {
      return chislo.size();
    }

    public double average() {
        double sum = 0;
        for (int i = 0; i <= (chislo.size()-1); i++) {
             sum = sum + (chislo.get(i).doubleValue());
        }
        return (sum / chislo.size());
    }

    public double sum() {
        double sum = 0;
        for (int i = 0; i <= (chislo.size()-1); i++) {
            sum = sum + (chislo.get(i).doubleValue());
        }
        return sum;
    }
    public T max(){
        int imax=0;
        for (int i = 0; i <= (chislo.size()-2); i++) {
            if((chislo.get(imax).doubleValue())<=(chislo.get(i+1).doubleValue())){
                imax=i+1;
            }
        }
        return chislo.get(imax);
    }
}