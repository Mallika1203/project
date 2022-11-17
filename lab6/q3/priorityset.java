public class priorityset extends Thread{
    public static void main(String args[]){
        priorityset t1 = new priorityset();
        priorityset t2 = new priorityset();

        t1.setPriority(4);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

        System.out.println( "Thread t1 has priority " +t1.getPriority());
        System.out.println( "Thread t2 has priority " +t2.getPriority());

       
    }
}