package Threads;
// 1. Running two threads
// 2. Making Threads to sleep

public class TwoThreads {
    public static void main(String[] args)  {
        Runnable runnable = () ->{
          String threadName = Thread.currentThread().getName();
          System.out.println(threadName+" is running");
          try{
              Thread.sleep(2000);

          }catch(InterruptedException e){
              e.printStackTrace();
            }
          System.out.println(threadName+ " is stopped");
        };

        Thread thread1 = new Thread(runnable,"The first Thread");
        thread1.start();

        Thread thread2 = new Thread(runnable,"The second Thread");
        thread2.start();

    }
}
