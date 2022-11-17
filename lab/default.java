package default;
class Student
{
     void walks()
     {
        System.out.println("Student walks");
     }
}

package mypack;
import default.*;

class School extends Student
{
     void walks()
     {
        super.walks();
        System.out.println("Student walks to school");
        
     }
     public static void main(String args[]){
         School obj = new School();
         obj.walks();
   }
}

