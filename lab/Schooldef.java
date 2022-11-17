package pack;
public class Student
{
     void walks()
     {
        System.out.println("Student walks");
     }
}

package mypack;
import pack.*;

class Schooldef
{
    
     public static void main(String args[]){
         Schooldef obj = new Schooldef();
         obj.walks();
   }
}

