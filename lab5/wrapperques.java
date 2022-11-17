import java.lang.*;

class wrapperques{
    public static void main(String args[]){

         
        Integer obj1 = Integer.valueOf(23);
        Double obj2 = Double.valueOf(5.55);
        Boolean obj3 = Boolean.valueOf(true);
        Character obj4 = Character.valueOf('M');
        Float obj5 = Float.valueOf(45.6f);
        Long obj6= Long.valueOf(40000);
        
        

        int var1 = obj1.intValue();
        double var2 = obj2.doubleValue();
        boolean var3 = obj3.booleanValue();
        char var4 = obj4.charValue();
        float var5 =obj5.floatValue();
        long var6 = obj6.longValue();

        
        

        System.out.println("The value of int variable: " + var1);
        System.out.println("The value of double variable: " + var2);
        System.out.println("The value of boolean variable: " + var3);
        System.out.println("The value of char variable: " + var4);
        System.out.println("The value of float variable: " + var5);
        System.out.println("The value of long variable: " + var6);
        
        



 



 

    }
}