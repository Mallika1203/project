public class Threadjoiningmethod extends Thread{
         public void run(){
          for(int i=1;i<=4;i++){
           try{
            Thread.sleep(20);
           }catch(Exception e){System.out.println(e);}
          System.out.println(i);
          }
         }
        public static void main(String args[]){
            Threadjoiningmethod t1=new Threadjoiningmethod ();
            Threadjoiningmethod t2=new Threadjoiningmethod ();
            Threadjoiningmethod t3=new Threadjoiningmethod ();
         t1.start();
         try{
          t1.join();
         }
         catch(Exception e){
             System.out.println(e);
             }

         t2.start();
         t3.start();
         }
        }