import java.util.ArrayList;
import java.util.*;

public class arraylistinsert{
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

    /* adding element 69 at index 5 */

    rollno.add(5, "69");
    System.out.println("After inserting: ");
    System.out.println(rollno);
  }
}