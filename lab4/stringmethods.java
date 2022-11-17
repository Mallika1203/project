class stringmethods{
    public static void main(String args[]){
        String s= "oops lab Assignment";
        String s2= " has been completed";
        String s3="hello";
        String s4="hello";
        String s5="HELLO";
        String s6= "four: " +5 +5;
        System.out.println(s6);
        System.out.println("Upper case: " +(s.toUpperCase()));    //upper case method
        System.out.println("Lower case: " +(s.toLowerCase()));    //lower case method
        System.out.println(s.startsWith("la"));          //starts with
        System.out.println(s.startsWith("oo"));
        System.out.println(s.endsWith("ment"));          //ends with method
        System.out.println("Character at zero position is : " +s.charAt(0));      //char at method
        System.out.println("Character at sixth position is : " +s.charAt(6));
        System.out.println("Replaced String: " +s.replace("oops", "MPI"));        //replace method
        System.out.println("Index of character 'm': " + s.indexOf('m'));         //index of method
        System.out.println("Concatenated String is: " +s.concat(s2));           //concat method
        System.out.println("The last index of the string is: " +s2.lastIndexOf('e'));
        System.out.println(s3.compareTo(s4));    //compare method
        System.out.println(s3.compareTo(s2));
        System.out.println(s3.compareToIgnoreCase(s5)); //comparetoignorecase method

        System.out.println("Strings equal: " +s.equals(s2));  //equals method
        System.out.println("Strings equal: " +s3.equals(s4)); 
        System.out.println("Strings equal: " +s3.equalsIgnoreCase(s5));  //equalsignore method
        System.out.println("String empty: " +s.isEmpty());      //check if empty method
        System.out.println("Trimmed String: " +s2.trim());      //trim method
        System.out.println("Subsequence: " +s.subSequence(0, 7)); //subsequence 
        System.out.print("The extracted substring is : " +s.substring(8));  //substring

  

    }
}