package Threads;
// Normal Java thread, new runnable as instance of the thread implements Runnable class
public class RunnableInterface {
    public static class MyRunnable implements Runnable{
        @Override
        public void run(){
            System.out.println("Thread is starting");
            System.out.println("Thread stopped");
        }
    }
    public static void main(String[] args){

        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
