package Multithreading;

import java.util.concurrent.atomic.AtomicReferenceArray;

public class MyAtomicArray {
    private static final String[] source = new String[10];
    private static final AtomicReferenceArray<String> atomicReferenceArray = new AtomicReferenceArray<>(source);

    public static void main(String[] args) {
        for (int i = 0; i < atomicReferenceArray.length(); i++) {
            atomicReferenceArray.set(i, "item-2");
        }

        Thread t1 = new Thread(new Increment());
        Thread t2 = new Thread(new Compare());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    static class Increment implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < atomicReferenceArray.length(); i++) {
                String add = atomicReferenceArray.getAndSet(i, "item-" + (i + 1));
                System.out.println("Thread " + Thread.currentThread().getId()
                        + ", index " + i + ", value: " + add);
            }
        }
    }

    static class Compare implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < atomicReferenceArray.length(); i++) {
                System.out.println("Thread " + Thread.currentThread().getId()
                        + ", index " + i + ", value: " + atomicReferenceArray.get(i));

                boolean swapped = atomicReferenceArray.compareAndSet(i, "item-2", "updated-item-2");

                if (swapped) {
                    System.out.println("Thread " + Thread.currentThread().getId()
                            + ", index " + i + ", updated-item-2");
                }
            }
        }
    }
}
