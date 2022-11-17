/* protected access modidier*/

class Student
{
     protected void walks()
     {
        System.out.println("Student walks");
     }
}

class school extends Student
{
     protected void walks()
     {
        super.walks();
        System.out.println("Student walks to school");
        
     }
     public static void main(String args[]){
         school obj = new school();
         obj.walks();
   }
}



     
