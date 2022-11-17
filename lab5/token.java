import java.util.*;
class token{
    public static void main(String args[]){
        
        StringTokenizer st = new StringTokenizer("The quick * brown / fox jumps / over the * lazy dog");
        System.out.println("Length of string tokenizer: " +st.countTokens());
        while (st.hasMoreTokens())
 
            
            System.out.println("Tokens: " +st.nextToken());
        String msg= "The quick * brown / fox jumps / over the * lazy dog";
        StringTokenizer str = new StringTokenizer(msg);
        while (str.hasMoreTokens())
 
            
            System.out.println("Tokens with delimiter: " +str.nextToken( "/*"));



    }
}