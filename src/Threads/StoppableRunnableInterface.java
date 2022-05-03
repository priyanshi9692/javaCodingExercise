package Threads;

public class StoppableRunnableInterface {
    public static class StoppableRunnable implements Runnable{
        private boolean stopRequested = false;

        public synchronized void requestStop(){
            this.stopRequested  = true;
        }
        public synchronized boolean isStopRequested(){
            return this.stopRequested;
        }
        private void sleep(long millis){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        @Override
        public void run(){
            System.out.println("Stoppable runnable is running");
            while(!isStopRequested()){
                sleep(5000);
                System.out.println("...running...");
            }
            System.out.println("Stoppable runnable is stopped");
        }
    }
    public static void main(String[] args){
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread = new Thread(stoppableRunnable, "The thread ");
        thread.start();

        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("requesting Stop");
        stoppableRunnable.requestStop();
        System.out.println("stop requested");
    }
}

// OS level threads are heavy than the normal threads- Project LOOM -to create lightweight threads(by JVM)