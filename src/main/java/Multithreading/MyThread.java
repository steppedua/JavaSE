package Multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Многопоточность:
 * - Реализовать механизм периодического асинхронного выполнения задач.
 * Т.е. механизм, который, не останавливая работу основной программы, раз в 10 секунд делает следующие действия:
 * 1. пишет в консоль "Асинхронный привет!"
 * 2. ждет (sleep) 5 секунд
 * 3. пишет в консоль "Асинхронный пока!"
 * Основная программа при этом должна каждую секунду писать в консоль "Работает основная программа".
 */

public class MyThread {

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);


        executor.scheduleWithFixedDelay(() -> {

            System.out.println("Работает основная программа");

        }, 0, 1, TimeUnit.SECONDS);

        executor.scheduleWithFixedDelay(() -> {
            System.out.println("Асинхронный привет!");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Асинхронный пока!");


        }, 0, 10, TimeUnit.SECONDS);

        executor.shutdown();
    }
}


