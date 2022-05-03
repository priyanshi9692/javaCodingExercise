package Threads;

public class JavaLambdaExpression {
    public static void main(String[] args){
        Runnable runnable = () ->{
            System.out.println("Thread is Starting");
            System.out.println("Thread is stopped");
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
