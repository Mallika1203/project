public class multi {
    public static void main(String[] args)
    {
        int n = 20; 
        for (int i = 0; i < n; i++) {
            Multithreading object
                = new Multithreading();
            object.start();
        }
    }
}
class Multithreading extends Thread {
    public void run()
    {
        try {
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            System.out.println("caught exception");
        }
    }
}