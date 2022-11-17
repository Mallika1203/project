//tostring() method implementation

class employee{  
 int ID;  
 String name;  
 String Department;  
  
 employee(int ID, String name, String Department){  
 this.ID=ID;  
 this.name=name;  
 this.Department=Department;  
 }  
   
 public String toString(){//overriding the toString() method  
  return ID+" "+name+" "+Department;  
 }  
 public static void main(String args[]){  
   employee e1=new employee(101,"Shashwat","Web Development");  
   employee e2=new employee(102,"Siddhant","Finance");  
     
   System.out.println(e1);//compiler writes here s1.toString()  
   System.out.println(e2);//compiler writes here s2.toString()  
 }  
}