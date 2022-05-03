package Threads;

public class ThreadNameCurrentThread {
    public static void main(String[] args){
        Runnable runnable = ()->{
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+"is running");
        };

        Thread thread = new Thread(runnable, "This thread ");
        thread.start();
    }
}
