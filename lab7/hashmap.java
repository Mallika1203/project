import java.util.*;
import java.util.stream.*;
import java.util.Map.*;
 
class hashmap
{
    // Program to convert names to an array in Java
    public static void main(String[] args)
    {
        Map<String, String> names = new HashMap<>();
        names.put("SE20UCSE086","Mallika");    
        names.put("SE20UCSE087","Malveeka");    
        names.put("SE20UCSE088","Manoj");    
        names.put("SE20UCSE089","Manas");
        names.put("SE20UCSE090","Manasa");   
        names.put("SE20UCSE090","Maneesh");  
        names.put("SE20UCSE091","Siddhant");
        names.put("SE20UCSE092","Amogha");
        names.put("SE20UCSE093","Shashwat");  
        names.put("SE20UCSE094","Sravanthi");
        names.put("SE20UCSE095","Pranav");

        System.out.println("HashMap elements:");
	    System.out.println(names); 

        Set<Map.Entry<String, String> > entrySet
            = names.entrySet();
  
        // Creating an ArrayList of Entry objects
        ArrayList<Map.Entry<String, String> > arrayofnames
            = new ArrayList<Entry<String, String> >(entrySet);

        System.out.println();
        System.out.println("After creating an array: ");
  
        System.out.println(arrayofnames);
    }
}
