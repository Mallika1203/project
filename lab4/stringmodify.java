class stringmodify{
    public static void main(String args[]){
        String s= "oops lab Assignment";
        String s2= " has been completed";


        System.out.println("Concatenated String is: " +s.concat(s2));           //concat method

        System.out.println("Upper case: " +(s.toUpperCase()));    //upper case method
        System.out.println("Lower case: " +(s.toLowerCase()));    //lower case method

        System.out.println("Replaced String: " +s.replace("oops", "MPI"));        //replace method

        System.out.println("Trimmed String: " +s2.trim());      //trim method
        System.out.println("Subsequence: " +s.subSequence(0, 7)); //subsequence 
        System.out.println("The extracted substring is : " +s.substring(8));  //substring

        System.out.println("Value of " +s+ " +" +s2+ " is: " +s.valueOf(s+s2)); //valueof method

    }
}