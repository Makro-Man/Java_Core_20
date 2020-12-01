package ua.lviv.lgs.mythread;

import java.util.Scanner;

public class MyThread extends Thread {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = scanner.nextInt();
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0+" "+n1+" ");
        for (int i = 3; i<=a;i++){
            n2 = n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
