class Student
{
     private void walks()
     {
        System.out.println("Student walks");
     }
}

class school extends Student
{
     void walks()
     {
        super.walks();
        System.out.println("Student walks to school");
        
     }
}

public class overridingpriv{

     public static void main(String args[]){
         school obj = new school();
         obj.walks();
   }
}