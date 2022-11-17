class q3
{
public static void main(String args[])
    {
        int a=0, b=1, c=0;
        int d;
        while(c<=100)
        { 
           c=a+b;
           a=b;
           b=c;
           d= a+b;
           for(int i=c+1; i<d; i++)
           {
              if(i>=100){
                 continue;
}
              else{
                  System.out.println("non fibinacci numbers are: " +i);
                  }
           }
           
        } 
    }
            
        
}