import java.util.ArrayList;
import java.util.*;

public class arraylistreverse{
  public static void main(String[] args) {
    ArrayList<String> rollno = new ArrayList<String>();
    rollno.add("86");
    rollno.add("87");
    rollno.add("88");
    rollno.add("89");
    rollno.add("90");
    rollno.add("91");
    rollno.add("92");
    rollno.add("93");
    rollno.add("94");
    rollno.add("95");
    System.out.println();
    System.out.println(rollno);

    /* Reversing arraylist */

    Collections.reverse(rollno);
    System.out.println("After reversing: " );
    System.out.println(rollno);
  }
}