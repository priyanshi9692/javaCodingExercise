package Threads;

public class ThreadCreation {
    public static class MyThread extends Thread{
        public void run(){
            System.out.println("Thread is starting");
            System.out.println("Thread Stopped");
        }
    }
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
