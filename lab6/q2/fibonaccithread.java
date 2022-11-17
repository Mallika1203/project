import java.io.*;
class Fibonacci implements Runnable
{
     public void run()
     {
          try
          {
               int a=0, b=1, c=0;
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

               System.out.print("Enter the Limit for required fibonacci sequence: ");

               int n = Integer.parseInt(br.readLine());
               System.out.println("Fibonacci series:");
               while (n>0)
               {
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    c=a+b;
                    n=n-1;
               }
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}
class fibonaccithread
{
     public static void main(String[] args)
     {
          
               Fibonacci fib = new Fibonacci();
               Thread t1 = new Thread(fib);
               t1.start();

          
     }
}