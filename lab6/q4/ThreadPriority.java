public class threadpriority extends Thread
{
      public void run()
      {
            String threadName = Thread.currentThread().getName();
            Integer priority = Thread.currentThread().getPriority();
            System.out.println(threadName + " has priority " + priority);
      }
      public static void main(String[] args) throws InterruptedException
      {
            threadpriority t1 = new threadpriority();
            threadpriority t2 = new threadpriority();
            threadpriority t3 = new threadpriority();
            threadpriority t4 = new threadpriority();
            threadpriority t5 = new threadpriority();

            t1.setPriority(Thread.MAX_PRIORITY);
            t2.setPriority(Thread.MIN_PRIORITY);
            t3.setPriority(3);
            t4.setPriority(Thread.NORM_PRIORITY);
            t5.setPriority(6);
  
            t1.start();
            t3.start();
            t4.start();
            //t2 and t5 are not runnning, only first, third and fourth threads are running
      }
}