class areas{

     void area(float a){
            double sq = a*a;
            System.out.println("Area of square is " +sq+ " sq units" );            
     }

     void area(int l, int b){
             int rect = l*b;
             System.out.println("Area of rectangle is " +rect+ " sq units");
     }
    
     void area(float b, float h){
             double trian = 0.5*b*h;
             System.out.println("Area of triangle is " +trian+ " sq units");
     }
  
     void area(double d1, double d2){
             double rhombus= 0.5*d1*d2;
             System.out.println("Area of rhombus is " +rhombus+ " sq units");
     }

     void area(float b, double h){
             double parallel = b*h;
             System.out.println("Area of parallelogram is " +parallel+ " sq units");
     }
     
     void area(int a, float b){
             double ellipse = 3.14*a*b;
             System.out.println("Area of ellipse is " +ellipse+ " sq units"); 
     }       
     
}

class perimeters{
    
      void peri(float a){
            double sq = 4*a;
            System.out.println("Perimeter of square is " +sq+ " units");
      }

      void peri(int a, int b){
            int rect = 2*(a+b);
            System.out.println("Perimeter of rectangle is " +rect+ " units");
      }

      void peri(double a, double b, double c){
            double trian = a+b+c;
            System.out.println("Perimeter of triangle is " +trian+ " units");
      }

      void peri(int s){
            int rhombus= 4*s;
            System.out.println("Perimeter of rhombus is " +rhombus+ " units");
      }

      void peri(float a, float b){
            double parallel = 2*(a+b);
            System.out.println("Perimeter of parallelogram is " +parallel+ " units");
     }

      void peri(double a, double b){
            double pm = Math.sqrt((a*a + b*b)/2);
            double ellipse = 2*3.14*pm;
            System.out.println("Perimeter of ellipse is " +ellipse+ " units");
     }
}

class overload{
   public static void main(String args[])
   {
       areas obj = new areas();
       perimeters ob = new perimeters();
       obj.area(5.5f);
       obj.area(76, 32);
       obj.area(3.4f, 7.3f);
       obj.area(7.34, 8.98);
       obj.area(1.2f, 4.5);
       obj.area(18, 4.6f);
       ob.peri(4.7f);
       ob.peri(6,9);
       ob.peri(8.98, 6.7, 9.8);
       ob.peri(36);
       ob.peri(5.6f, 8.9f);
       ob.peri(9.6, 5.6);
      
   }
}
 