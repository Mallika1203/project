class lab2
{
    public static void main(String args[])
    {
       Display(0);
    }
    static void Display(int i)

       {
         if(i<11)
       {
           System.out.println("Value of i is " +i);
           i++;
           Display(i);
       }
       
       
       }
}