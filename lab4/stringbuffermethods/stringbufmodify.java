class stringbufmodify{
    public static void main(String args[]){
        char[] str= {'a', 's', 'f'};
        StringBuffer sb= new StringBuffer("OOPS lab assignment");
        StringBuffer sb2 = new StringBuffer("I listening to music");
        StringBuffer sb3 = new StringBuffer("Machine Learning is fun!");
        StringBuffer sb4 = new StringBuffer("I am Mallika");
        StringBuffer sb5 = new StringBuffer("I like to listen to Stray Kids");

        System.out.println("Capacity= " + sb.capacity());

        sb.ensureCapacity(40);                          //ensure capacity method
        System.out.println("New Capacity= " + sb.capacity());
        sb.setLength(8);
        System.out.println("New Length: " +sb.length()); //String buffer length method 
        System.out.println("New sequence: " +sb);
        System.out.println("charAt(5) before= " +sb.charAt(5));  //CharAt() method
        sb.setCharAt(5, 'a');
        System.out.println("charAt(5) after= " +sb.charAt(5));
        sb.append(str);         //String buffer append() method
        System.out.println("After append: " + sb);
        sb2.insert(2, "love ");    //insert method     
        System.out.println("After insertion: " +sb2);
        System.out.println("Reversed String Buffer: " +sb2.reverse());  //reverse method
        System.out.println("After Deletion: " +sb5.delete(7,20)); //delete method
        System.out.println("After deleteCharAt: " +sb4.deleteCharAt(3)); //deleteCharAt method
        System.out.println("After replacing: " +sb3.replace(17,19, "isn't"));  //replace method

        System.out.println("Substring: " +sb4.substring(4));  //substring

    }
}