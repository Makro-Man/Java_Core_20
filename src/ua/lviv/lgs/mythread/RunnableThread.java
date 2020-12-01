package ua.lviv.lgs.mythread;

import java.util.Scanner;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int b = scanner.nextInt();
        Fibonacci f = new Fibonacci(b);
        f.print();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
