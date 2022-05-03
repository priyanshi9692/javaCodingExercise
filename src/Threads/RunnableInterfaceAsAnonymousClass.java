package Threads;

public class RunnableInterfaceAsAnonymousClass {
    public static void main(String[] args){
        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                System.out.println("Thread is starting");
                System.out.println("Thread is Stopped");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
