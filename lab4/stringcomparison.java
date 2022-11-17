class stringcomparison{
    public static void main(String args[]){
         String s= "oops lab Assignment";
         String s2= " has been completed";
         String s3="hello";
         String s4="hello";
         String s5="HELLO";
         String s6="Submission deadline is by today EOD";

         System.out.println("Starts with 'la': " +s.startsWith("la"));          //starts with
         System.out.println("Starts with 'oo': " +s.startsWith("oo"));
         System.out.println("Ends with 'ment': " +s.endsWith("ment"));          //ends with method

         System.out.println("The last index of the string is: " +s2.lastIndexOf('e')); //last index of method
         System.out.println("Index of character 'm': " + s6.indexOf('a'));         //index of method

         System.out.println(s3.compareTo(s4));    //compareto method; return 0 if equal
         System.out.println(s3.compareTo(s2));
         System.out.println(s3.compareToIgnoreCase(s5)); //comparetoignorecase method

         System.out.println("Strings equal: " +s.equals(s2));  //equals method
         System.out.println(s3==s4); 
         System.out.println("Strings equal: " +s3.equalsIgnoreCase(s5));  //equalsignore method

         System.out.println("String empty: " +s.isEmpty());      //check if empty method

         System.out.println("Character at zero position is : " +s.charAt(0));      //char at method
         System.out.println("Character at sixth position is : " +s.charAt(6));

         System.out.println("s[0 - 7] == s6[28 - 35]: " +s.regionMatches(0, s6, 28, 8));  //region matches method
         System.out.println("s[9 - 15] == s6[9 - 15]?: " +s.regionMatches(9, s6, 9, 8));

    }
}