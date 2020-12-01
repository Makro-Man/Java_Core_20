package ua.lviv.lgs.mythread;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run();
        RunnableThread runnableThread = new RunnableThread();
        runnableThread.run();
    }
}
